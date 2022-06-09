package controller;

import View.tm.MealTM;
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
import model.Meal;

import java.io.IOException;
import java.util.Optional;

public class MealPlanesFormController {
    public AnchorPane context;
    public JFXTextField txtMealNo;
    public Text txtPrice;
    public JFXComboBox cbxMealType;
    public JFXComboBox cbxMealName;
    public TableColumn colMealNo;
    public TableColumn colMealType;
    public TableColumn colMealName;
    public TableColumn colMealPrice;
    public TableColumn colOption;
    public TableView<MealTM> tblMeal;
    
    public void initialize(){

        ObservableList<String> obList1 = FXCollections.observableArrayList();
        obList1.add("Local");
        obList1.add("Chinese");
        obList1.add("French");
        cbxMealType.setItems(obList1);

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

        cbxMealType.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {
                    if (newValue.equals("Local")){
                        cbxMealName.setItems(local);
                    }else if (newValue.equals("Chinese")){
                        cbxMealName.setItems(chinese);
                    }else if (newValue.equals("French")){
                        cbxMealName.setItems(french);
                    }
                });

        cbxMealName.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {
                            if (newValue.equals("Chicken-Rice & curry")) {
                                txtPrice.setText("Rs. 350/=");
                            } else if (newValue.equals("Fish-Rice & curry")) {
                                txtPrice.setText("Rs. 250/=");
                            } else if (newValue.equals("Egg-Rice & curry")) {
                                txtPrice.setText("Rs. 180/=");
                            } else if (newValue.equals("Milk Rice")) {
                                txtPrice.setText("Rs. 25/=");
                            } else if (newValue.equals("String Hoppers")) {
                                txtPrice.setText("Rs. 45/=");
                            } else if (newValue.equals("Hoppers")) {
                                txtPrice.setText("Rs. 15/=");
                            } else if (newValue.equals("Pittu")) {
                                txtPrice.setText("Rs. 35/=");
                            } else if (newValue.equals("Those")) {
                                txtPrice.setText("Rs. 35/=");
                            } else if (newValue.equals("Tea")) {
                                txtPrice.setText("Rs. 35/=");
                            } else if (newValue.equals("Coffee")) {
                                txtPrice.setText("Rs. 30/=");
                            } else if (newValue.equals("Kolakenda")) {
                                txtPrice.setText("Rs. 50/=");
                            } else if (newValue.equals("Chicken Fried Rice")) {
                                txtPrice.setText("Rs. 450/=");
                            } else if (newValue.equals("Fish Fried Rice")) {
                                txtPrice.setText("Rs. 300/=");
                            } else if (newValue.equals("Egg Fried Rice")) {
                                txtPrice.setText("Rs. 250/=");
                            } else if (newValue.equals("Mixed Fried Rice")) {
                                txtPrice.setText("Rs. 750/=");
                            } else if (newValue.equals("Chicken Noodles")) {
                                txtPrice.setText("Rs. 550/=");
                            } else if (newValue.equals("Vegetable Noodles")) {
                                txtPrice.setText("Rs. 450/=");
                            } else if (newValue.equals("Mixed Noodles")) {
                                txtPrice.setText("Rs. 650/=");
                            } else if (newValue.equals("Vegetable Soup")) {
                                txtPrice.setText("Rs. 450/=");
                            } else if (newValue.equals("Chicken Soup")) {
                                txtPrice.setText("Rs. 550/=");
                            } else if (newValue.equals("Tomato Soup")) {
                                txtPrice.setText("Rs. 500/=");
                            } else if (newValue.equals("Egg & Noodles")) {
                                txtPrice.setText("Rs. 650/=");
                            } else if (newValue.equals("Sea Food Soup")) {
                                txtPrice.setText("Rs. 700/=");
                            } else if (newValue.equals("Egg Sandwich")) {
                                txtPrice.setText("Rs. 250/=");
                            } else if (newValue.equals("Chicken Sandwich")) {
                                txtPrice.setText("Rs. 300/=");
                            } else if (newValue.equals("Cheese & Tomato Sandwich")) {
                                txtPrice.setText("Rs. 500/=");
                            } else if (newValue.equals("Ham & Cheese Sandwich")) {
                                txtPrice.setText("Rs. 600/=");
                            } else if (newValue.equals("Special Club Sandwich")) {
                                txtPrice.setText("Rs. 800/=");
                            } else if (newValue.equals("Egg Burger")) {
                                txtPrice.setText("Rs. 400/=");
                            } else if (newValue.equals("Chicken Burger")) {
                                txtPrice.setText("Rs. 500/=");
                            } else if (newValue.equals("Chicken Submarine")) {
                                txtPrice.setText("Rs. 750/=");
                            } else if (newValue.equals("Hot Dog")) {
                                txtPrice.setText("Rs. 650/=");
                            } else if (newValue.equals("Meal Pack")) {
                                txtPrice.setText("Rs. 1750/=");
                            }

                });

        colMealNo.setCellValueFactory(new PropertyValueFactory("mealNo"));
        colMealType.setCellValueFactory(new PropertyValueFactory("mealType"));
        colMealName.setCellValueFactory(new PropertyValueFactory("mealName"));
        colMealPrice.setCellValueFactory(new PropertyValueFactory("mealPrice"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));

        loadAllMealPlanes();
    }

    private void loadAllMealPlanes() {
        ObservableList<MealTM> obList = FXCollections.observableArrayList();

        for (Meal m : Database.mealTable
             ) {
            Button btn = new Button("- Remove");
            btn.setStyle("-fx-background-color: #d53434");
            MealTM tm = new MealTM(m.getMealNo(), m.getMealType(), m.getMealName(), m.getMealPrice(), btn);
            obList.add(tm);

            btn.setOnAction((e)->{

                Alert alert =new Alert(Alert.AlertType.WARNING, "This will delete permenrently!, Do You Want Delete?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType=alert.showAndWait();

                if (buttonType.get().equals(ButtonType.YES)) {
                    Database.customerTable.remove(m);
                    obList.remove(tm);
                }
            });
        }
        tblMeal.setItems(obList);
    }

    public void availableMealPlanesOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/AvailableMealPlanesForm.fxml"));
        context.getChildren().add(parent);
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

    public void btnAddNewOnAction(ActionEvent actionEvent) {
        Meal m1 = new Meal(
                txtMealNo.getText(),
                (String) cbxMealType.getValue(),
                (String) cbxMealName.getValue(),
                txtPrice.getText()
        );
    }

    public void btnChangeOnAction(ActionEvent actionEvent) {
    }

}
