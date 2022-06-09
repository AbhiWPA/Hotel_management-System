package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminFormController {
    public AnchorPane context;
    public Button roomsbtn;
    public Button mealPlanesbtn;
    public Button incomeReportbtn;

    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/RoomForm.fxml"));
        context.getChildren().add(parent);
    }

    public void mealPlanesOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/MealPlanesForm.fxml"));
        context.getChildren().add(parent);
    }

    public void incomeReportOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/IncomeReportForm.fxml"));
        context.getChildren().add(parent);
    }



    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        context.getChildren().add(parent);
    }
}
