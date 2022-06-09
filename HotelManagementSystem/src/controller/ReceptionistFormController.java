package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class ReceptionistFormController{
    public AnchorPane context;
    public Text txtSingle;
    public Text txtDouble;
    public Text txtTriple;
    public Text txtQuad;

    public void initialize(){
        txtSingle.setText("01");
        txtDouble.setText("06");
        txtTriple.setText("03");
        txtQuad.setText("03");
    }


    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        context.getChildren().add(parent);
    }

    public void addNewCustomerOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/AddNewCustomerForm.fxml"));
        context.getChildren().add(parent);
    }

    public void viewRoomDetailsOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/ViewRoomDetailsForm.fxml"));
        context.getChildren().add(parent);
    }

    public void updateCustomerDetailsOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/UpdateCustomerDetailsForm.fxml"));
        context.getChildren().add(parent);
    }
}
