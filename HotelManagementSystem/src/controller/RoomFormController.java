package controller;

import View.tm.AdminRoomTM;
import View.tm.CustomerTM;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Customer;
import model.Rooms;

import java.io.IOException;
import java.util.Optional;

public class RoomFormController {


    public AnchorPane context;
    public Text txtSingle;
    public Text txtDouble;
    public Text txtQuad;
    public Text txtTriple;
    public Text txtTotal;
    public TableView<AdminRoomTM> tblRoom;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableColumn colOption;
    public JFXTextField txtfRoomNo;
    public JFXComboBox cbxRoomType;

    public void initialize(){

        ObservableList<String> obList = FXCollections.observableArrayList();
        obList.add("Single Room");
        obList.add("Double Room");
        obList.add("Triple Room");
        obList.add("Quad Room");
        cbxRoomType.setItems(obList);

        cbxRoomType.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {

                });


        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));


        loadAllRooms();

        tblRoom.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {

                    if (newValue != null){
                        setData(newValue);
                    }
        });

        int single = Integer.parseInt(txtSingle.getText());
        int dbl = Integer.parseInt(txtDouble.getText());
        int triple = Integer.parseInt(txtTriple.getText());
        int quad = Integer.parseInt(txtQuad.getText());
        int tot = Integer.parseInt(txtTotal.getText());

        cbxRoomType.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {
                    if (newValue.equals("Single Room")){
                        int i = single + 1;
                        int j = tot + 1;

                        txtSingle.setText(String.valueOf(i));
                        txtTotal.setText(String.valueOf(j));

                    }else if (newValue.equals("Double Room")){
                        int i = dbl + 1;
                        int j = tot + 1;

                        txtDouble.setText(String.valueOf(i));
                        txtTotal.setText(String.valueOf(j));

                    }else if (newValue.equals("Triple Room")){
                        int i = triple + 1;
                        int j = tot + 1;

                        txtTriple.setText(String.valueOf(i));
                        txtTotal.setText(String.valueOf(j));

                    }else if (newValue.equals("Quad Room")){
                        int i = quad + 1;
                        int j = tot + 1;

                        txtQuad.setText(String.valueOf(i));
                        txtTotal.setText(String.valueOf(j));

                    }
                });
    }

    private void setData(AdminRoomTM tm) {
        txtfRoomNo.setText(tm.getRoomNo());
        cbxRoomType.setValue(tm.getRoomType());
    }

    private void loadAllRooms() {
        ObservableList<AdminRoomTM> obList = FXCollections.observableArrayList();

        for (Rooms r : Database.roomsTable
             ) {
            Button btn = new Button("Delete");
            AdminRoomTM tm = new AdminRoomTM(r.getRoomNo(), r.getRoomType(), btn);
            obList.add(tm);

            btn.setOnAction((e)->{
                Alert alert =new Alert(Alert.AlertType.WARNING, "This will delete permenrently!, Do You Want Delete?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType=alert.showAndWait();

                if (buttonType.get().equals(ButtonType.YES)) {
                    Database.customerTable.remove(r);
                    obList.remove(tm);
                }
            });
        }
        tblRoom.setItems(obList);
    }

    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"));
        context.getChildren().add(parent);
    }

    public void homeButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        context.getChildren().add(parent);
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        Rooms r = new Rooms(
                txtfRoomNo.getText(),
                (String) cbxRoomType.getValue()
        );
        Database.roomsTable.add(r);
        loadAllRooms();

    }

    public void changeRoomOnAction(ActionEvent actionEvent) {
        for (Rooms tm : Database.roomsTable
        ) {
            if (tm.getRoomNo().equals(txtfRoomNo.getText())){

                tm.setRoomNo(txtfRoomNo.getText());
                return;
            }
        }
    }
}
