package controller;

import View.tm.CustomerTM;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import model.Customer;

import java.io.IOException;

public class UpdateCustomerDetailsFormController {
    TableView<CustomerTM> tblCustomer;

    public AnchorPane context;
    public JFXTextField cusNotxt;
    public JFXTextField txtName;
    public JFXTextField txtNic;
    public JFXTextField txtTel;
    public JFXTextField txtMail;
    public JFXTextField txtAddress;

    /*public void initialize(){

        tblCustomer.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) ->{
                    setData(newValue);
                });
    }*/

    private void setData(CustomerTM tm) {

        for (Customer c : Database.customerTable
        ) {
            boolean b1 = Database.contains(new Customer(c.getcNo()));
            if (b1 == true) {
                txtName.setText(tm.getName());
                txtNic.setText(tm.getNic());
                txtTel.setText(tm.getTel());
                txtMail.setText(tm.getMail());
                txtAddress.setText(tm.getAddress());
            }
        }
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

    public void changebtnOnAction(ActionEvent actionEvent) {
        for (Customer tm : Database.customerTable
        ) {
            if (tm.getcNo().equals(cusNotxt.getText())) {

                tm.setName(txtName.getText());
                tm.setNic(txtNic.getText());
                tm.setTel(txtTel.getText());
                tm.setMail(txtMail.getText());
                tm.setAddress(txtAddress.getText());
                loadAllCustomers();
                return;
            }
        }
    }

    private void loadAllCustomers() {
        ObservableList<CustomerTM> oblist = FXCollections.observableArrayList();

        for (Customer c : Database.customerTable
        ) {
            Button btn = new Button("Delete");
            CustomerTM tm = new CustomerTM(c.getcNo(), c.getName(), c.getNic(), c.getTel(), c.getMail(), c.getAddress(), c.getRoom(), c.getMeal(), btn);
            oblist.add(tm);
        }
        tblCustomer.setItems(oblist);
    }
}
