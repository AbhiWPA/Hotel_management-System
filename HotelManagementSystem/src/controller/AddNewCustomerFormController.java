package controller;

import View.tm.CustomerTM;
import com.jfoenix.controls.JFXButton;
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

import java.io.IOException;
import java.util.Optional;

public class AddNewCustomerFormController {
    public AnchorPane context;
    public TableView<CustomerTM> tblCustomer;
    public TableColumn colNo;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colTel;
    public TableColumn colMail;
    public TableColumn colAddress;
    public TableColumn colRoom;
    public TableColumn colMeal;
    public TableColumn colOption;

    public JFXTextField txtCusName;
    public JFXTextField txtCusNo;
    public JFXTextField txtNIC;
    public JFXTextField txtTel;
    public JFXTextField txtMail;
    public JFXTextField txtAddress;
    public JFXButton btnSave;
    public JFXButton btnUpdate;
    public JFXComboBox mealtypeCbx;
    public JFXComboBox mealCbx;
    public Label lblPrice;
    public Text txtPrice;
    public JFXComboBox cbxRoomType;


    public void initialize(){
        colNo.setCellValueFactory(new PropertyValueFactory("cNo"));
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colNic.setCellValueFactory(new PropertyValueFactory("nic"));
        colTel.setCellValueFactory(new PropertyValueFactory("tel"));
        colMail.setCellValueFactory(new PropertyValueFactory("mail"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colRoom.setCellValueFactory(new PropertyValueFactory("room"));
        colMeal.setCellValueFactory(new PropertyValueFactory("meal"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));

        ObservableList<String> roomType = FXCollections.observableArrayList();
        roomType.add("Single Room");
        roomType.add("Double Room");
        roomType.add("Triple Room");
        roomType.add("Quad Room");
        cbxRoomType.setItems(roomType);

        ObservableList<String> obList1 = FXCollections.observableArrayList();
        obList1.add("Local");
        obList1.add("Chinese");
        obList1.add("French");
        mealtypeCbx.setItems(obList1);

        ObservableList<String> local = FXCollections.observableArrayList();
        local.add("Chicken-Rice & curry");
        local.add("Fish-Rice & curry");
        local.add("Egg-Rice & curry");
        local.add("Milk Rice");
        local.add("String Hoppers");
        local.add("Hoppers");
        local.add("Pittu");
        local.add("Those");
        local.add("Tea");
        local.add("Coffee");
        local.add("Kolakenda");

        ObservableList<String> chinese = FXCollections.observableArrayList();
        chinese.add("Chicken Fried Rice");
        chinese.add("Fish Fried Rice");
        chinese.add("Egg Fried Rice");
        chinese.add("Mixed Fried Rice");
        chinese.add("Chicken Noodles");
        chinese.add("Vegetable Noodles");
        chinese.add("Mixed Noodles");
        chinese.add("Vegetable Soup");
        chinese.add("Chicken Soup");
        chinese.add("Tomato Soup");
        chinese.add("Egg & Noodles");
        chinese.add("Sea Food Soup");

        ObservableList<String> french = FXCollections.observableArrayList();
        french.add("Egg Sandwich");
        french.add("Chicken Sandwich");
        french.add("Cheese & Tomato Sandwich");
        french.add("Ham & Cheese Sandwich");
        french.add("Special Club Sandwich");
        french.add("Egg Burger");
        french.add("Chicken Burger");
        french.add("Chicken Submarine");
        french.add("Hot Dog");
        french.add("Meal Pack");

        mealtypeCbx.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {
                    if (newValue.equals("Local")){
                        mealCbx.setItems(local);
                    }else if (newValue.equals("Chinese")){
                        mealCbx.setItems(chinese);
                    }else if (newValue.equals("French")){
                        mealCbx.setItems(french);
                    }
                });


        mealCbx.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {
                    if(newValue.equals("Chicken-Rice & curry")){txtPrice.setText("Rs. 350/=");}
                     else if(newValue.equals("Fish-Rice & curry")){txtPrice.setText("Rs. 250/=");}
                     else if(newValue.equals("Egg-Rice & curry")){txtPrice.setText("Rs. 180/=");}
                     else if(newValue.equals("Milk Rice")){txtPrice.setText("Rs. 25/=");}
                     else if(newValue.equals("String Hoppers")){txtPrice.setText("Rs. 45/=");}
                     else if(newValue.equals("Hoppers")){txtPrice.setText("Rs. 15/=");}
                     else if(newValue.equals("Pittu")){txtPrice.setText("Rs. 35/=");}
                     else if(newValue.equals("Those")){txtPrice.setText("Rs. 35/=");}
                     else if(newValue.equals("Tea")){txtPrice.setText("Rs. 35/=");}
                     else if(newValue.equals("Coffee")){txtPrice.setText("Rs. 30/=");}
                     else if(newValue.equals("Kolakenda")){txtPrice.setText("Rs. 50/=");}

                    else if(newValue.equals("Chicken Fried Rice")){txtPrice.setText("Rs. 450/=");}
                    else if(newValue.equals("Fish Fried Rice")){txtPrice.setText("Rs. 300/=");}
                    else if(newValue.equals("Egg Fried Rice")){txtPrice.setText("Rs. 250/=");}
                    else if(newValue.equals("Mixed Fried Rice")){txtPrice.setText("Rs. 750/=");}
                    else if(newValue.equals("Chicken Noodles")){txtPrice.setText("Rs. 550/=");}
                    else if(newValue.equals("Vegetable Noodles")){txtPrice.setText("Rs. 450/=");}
                    else if(newValue.equals("Mixed Noodles")){txtPrice.setText("Rs. 650/=");}
                    else if(newValue.equals("Vegetable Soup")){txtPrice.setText("Rs. 450/=");}
                    else if(newValue.equals("Chicken Soup")){txtPrice.setText("Rs. 550/=");}
                    else if(newValue.equals("Tomato Soup")){txtPrice.setText("Rs. 500/=");}
                    else if(newValue.equals("Egg & Noodles")){txtPrice.setText("Rs. 650/=");}
                    else if(newValue.equals("Sea Food Soup")){txtPrice.setText("Rs. 700/=");}

                    else if(newValue.equals("Egg Sandwich")){txtPrice.setText("Rs. 250/=");}
                    else if(newValue.equals("Chicken Sandwich")){txtPrice.setText("Rs. 300/=");}
                    else if(newValue.equals("Cheese & Tomato Sandwich")){txtPrice.setText("Rs. 500/=");}
                    else if(newValue.equals("Ham & Cheese Sandwich")){txtPrice.setText("Rs. 600/=");}
                    else if(newValue.equals("Special Club Sandwich")){txtPrice.setText("Rs. 800/=");}
                    else if(newValue.equals("Egg Burger")){txtPrice.setText("Rs. 400/=");}
                    else if(newValue.equals("Chicken Burger")){txtPrice.setText("Rs. 500/=");}
                    else if(newValue.equals("Chicken Submarine")){txtPrice.setText("Rs. 750/=");}
                    else if(newValue.equals("Hot Dog")){txtPrice.setText("Rs. 650/=");}
                    else if(newValue.equals("Meal Pack")){txtPrice.setText("Rs. 1750/=");}
        });


        loadAllCustomers();

        tblCustomer.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }

    private void setData(CustomerTM tm) {
        txtCusNo.setText(tm.getcNo());
        txtCusName.setText(tm.getName());
        txtNIC.setText(tm.getNic());
        txtTel.setText(tm.getTel());
        txtMail.setText(tm.getMail());
        txtAddress.setText(tm.getAddress());
        cbxRoomType.setValue(tm.getRoom());
        mealtypeCbx.setValue(tm.getMeal());
    }


    private void loadAllCustomers() {
        ObservableList<CustomerTM> oblist = FXCollections.observableArrayList();

        for (Customer c : Database.customerTable
             ) {
            Button btn = new Button("Delete");
            CustomerTM tm = new CustomerTM(c.getcNo(), c.getName(), c.getNic(), c.getTel(), c.getMail(), c.getAddress(), c.getRoom(), c.getMeal(), btn);
            oblist.add(tm);

            btn.setOnAction((e)->{

                Alert alert =new Alert(Alert.AlertType.WARNING, "This will delete permanently!, Do You Want Delete?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType=alert.showAndWait();

                if (buttonType.get().equals(ButtonType.YES)) {
                    Database.customerTable.remove(c);
                    oblist.remove(tm);
                }
            });
        }
        tblCustomer.setItems(oblist);
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

    public void savebtnOnAction(ActionEvent actionEvent) {
        Customer c1 = new Customer(
                txtCusNo.getText(),
                txtCusName.getText(),
                txtNIC.getText(),
                txtTel.getText(),
                txtMail.getText(),
                txtAddress.getText()
        );
        Database.customerTable.add(c1);
        loadAllCustomers();
    }

    public void updatebtnOnAction(ActionEvent actionEvent) {
        for (Customer tm : Database.customerTable
             ) {
            if (tm.getcNo().equals(txtCusNo.getText())){

                tm.setName(txtCusName.getText());
                tm.setNic(txtNIC.getText());
                tm.setTel(txtTel.getText());
                tm.setMail(txtMail.getText());
                tm.setAddress(txtAddress.getText());
                loadAllCustomers();
                return;
            }
        }
    }

    public void billPrintBtnOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/BillPrintForm.fxml"));
        context.getChildren().add(parent);

        for (Customer tm : Database.customerTable
        ) {
            if (tm.getcNo().equals(txtCusNo.getText())){

                tm.setName(txtCusName.getText());
                tm.setNic(txtNIC.getText());
                tm.setTel(txtTel.getText());
                tm.setMail(txtMail.getText());
                tm.setAddress(txtAddress.getText());
                loadAllCustomers();
                return;
            }
        }

    }


}
