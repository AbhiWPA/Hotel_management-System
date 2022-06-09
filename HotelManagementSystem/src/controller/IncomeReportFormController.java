package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class IncomeReportFormController implements Initializable {
    public AnchorPane context;

    @FXML
    public BarChart brChart;

    @FXML
    public CategoryAxis brMonth;

    @FXML
    public NumberAxis brIncome;

    @FXML
    private LineChart lncrtAnual;

    @FXML
    private CategoryAxis yearSide;

    @FXML
    private NumberAxis incomeSide;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        series.setName("Month");

        series.getData().add(new XYChart.Data<>("2012", 500000));
        series.getData().add(new XYChart.Data<>("2013", 450000));
        series.getData().add(new XYChart.Data<>("2014", 750000));
        series.getData().add(new XYChart.Data<>("2015", 1400000));
        series.getData().add(new XYChart.Data<>("2016", 1000000));
        series.getData().add(new XYChart.Data<>("2017", 1050000));
        series.getData().add(new XYChart.Data<>("2018", 1200000));
        series.getData().add(new XYChart.Data<>("2019", 900000));
        series.getData().add(new XYChart.Data<>("2020", 800000));
        series.getData().add(new XYChart.Data<>("2021", 700000));

        lncrtAnual.getData().addAll(series);

        XYChart.Series<String, Integer> series2 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>("Jan", 500000));
        series2.getData().add(new XYChart.Data<>("Feb", 450000));
        series2.getData().add(new XYChart.Data<>("March", 750000));
        series2.getData().add(new XYChart.Data<>("April", 1400000));
        series2.getData().add(new XYChart.Data<>("May", 1000000));
        series2.getData().add(new XYChart.Data<>("June", 1050000));
        series2.getData().add(new XYChart.Data<>("July", 1200000));
        series2.getData().add(new XYChart.Data<>("Aug", 900000));
        series2.getData().add(new XYChart.Data<>("Sept", 800000));
        series2.getData().add(new XYChart.Data<>("Oct", 700000));
        series2.getData().add(new XYChart.Data<>("Nov", 750000));
        series2.getData().add(new XYChart.Data<>("Dec", 650000));

        brChart.getData().addAll(series2);
    }

    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/adminForm.fxml"));
        context.getChildren().add(parent);
    }

    public void homeButtonOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        context.getChildren().add(parent);
    }

}
