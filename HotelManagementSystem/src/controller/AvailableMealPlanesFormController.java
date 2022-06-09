package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AvailableMealPlanesFormController {
    public AnchorPane context;

    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/MealPlanesForm.fxml"));
        context.getChildren().add(parent);
    }

    public void homeButonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        context.getChildren().add(parent);
    }
}
