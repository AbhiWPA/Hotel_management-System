package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Optional;

public class LoginFormController {
    public JFXPasswordField pswdtxt;
    public JFXButton adminlogbtn;
    public JFXButton receptionistlogbtn;
    public JFXTextField userNametxt;
    public AnchorPane context;

    String adminName = "admin";
    String adminPswd = "admin123";

    String receptName = "reception";
    String receptPswd = "reception123";


    public void receptionistLogOnAction(ActionEvent actionEvent) throws IOException {
        if(userNametxt.getText().equals(receptName) && pswdtxt.getText().equals(receptPswd)){
            context.getChildren().clear();
            Parent parent = FXMLLoader.load(getClass().getResource("../view/ReceptionistForm.fxml"));
            context.getChildren().add(parent);
        }else{
            Alert alert =new Alert(Alert.AlertType.WARNING, "Incorrect User Name or Password, Try again!",
                    ButtonType.OK);
            alert.showAndWait();
        }
    }

    public void adminLogOnAction(ActionEvent actionEvent) throws IOException {
        if(userNametxt.getText().equals(adminName) && pswdtxt.getText().equals(adminPswd)){
            context.getChildren().clear();
            Parent parent = FXMLLoader.load(getClass().getResource("../view/adminForm.fxml"));
            context.getChildren().add(parent);
        }else{
            Alert alert =new Alert(Alert.AlertType.WARNING, "Incorrect User Name or Password, Try again!",
                    ButtonType.OK);
            alert.showAndWait();
        }
    }
}

  