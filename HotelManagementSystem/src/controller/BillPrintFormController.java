package controller;

import View.tm.BillTM;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Bill;

public class BillPrintFormController extends AddNewCustomerFormController{
    public AnchorPane context;
    public TableView<BillTM> tblBill;
    public TableColumn colDate;
    public TableColumn colDescription;
    public TableColumn colChanges;
    public TableColumn colBalance;
    
    public void initialize(){

        colDate.setCellValueFactory(new PropertyValueFactory("date"));
        colDescription.setCellValueFactory(new PropertyValueFactory("description"));
        colChanges.setCellValueFactory(new PropertyValueFactory("change"));
        colBalance.setCellValueFactory(new PropertyValueFactory("balance"));

        loadAllBills();
    }

    private void loadAllBills() {
        ObservableList<BillTM> obList = FXCollections.observableArrayList();

        for (Bill b : Database.customerTable
             ) {
            DatePicker pck = new DatePicker();
            TextArea des = new TextArea();
            Label change = new Label();
            Label bal = new Label();
            BillTM tm = new BillTM(pck, des, change, bal);
            obList.add(tm);

        }
        tblBill.setItems(obList);
    }
}
