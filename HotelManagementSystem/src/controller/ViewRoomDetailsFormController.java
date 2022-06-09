package controller;

import View.tm.RoomsTM;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Rooms;

import java.io.IOException;

public class ViewRoomDetailsFormController {
    public AnchorPane context;
    public TableView tblRooms;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableColumn colCbx;
    public TableColumn colBook;

    public void initialize(){

        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colCbx.setCellValueFactory(new PropertyValueFactory("cbx"));
        colBook.setCellValueFactory(new PropertyValueFactory("cmbx"));
        loadAllRooms();
    }

    private void loadAllRooms() {
        ObservableList<RoomsTM> obList = FXCollections.observableArrayList();

        for (Rooms r : Database.roomsTable
             ) {
            CheckBox cbx = new CheckBox();
            ComboBox cmb = new ComboBox();
            ObservableList<String> roombook = FXCollections.observableArrayList();
            roombook.add("Booked");
            roombook.add("Released");
            cmb.setItems(roombook);
            RoomsTM tm = new RoomsTM(r.getRoomNo(), r.getRoomType(), cbx, cmb);
            obList.add(tm);
        }

        tblRooms.setItems(obList);
    }


    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/ReceptionistForm.fxml"));
        context.getChildren().add(parent);
    }

    public void homeButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        context.getChildren().add(parent);
    }
}
