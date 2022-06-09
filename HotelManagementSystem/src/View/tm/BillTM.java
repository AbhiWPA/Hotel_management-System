package View.tm;

import controller.AddNewCustomerFormController;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class BillTM extends AddNewCustomerFormController {
    private DatePicker date;
    private TextArea description;
    private Label change;
    private Label balance;

    AddNewCustomerFormController c1;

    public BillTM() {
    }

    public BillTM(DatePicker date, TextArea description, Label change, Label balance) {
        this.date = date;
        this.description = description;
        this.change = change;
        this.balance = balance;
    }

    public DatePicker getDate() {
        return date;
    }

    public void setDate(DatePicker date) {
        this.date = date;
    }

    public TextArea getDescription() {
        return description;
    }

    public void setDescription(TextArea description) {
        this.description = description;
    }

    public Label getChange() {
        return change;
    }

    public void setChange(Label change) {
        this.change = change;
    }

    public Label getBalance() {
        return balance;
    }

    public void setBalance(Label balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "date=" + date +
                ", description=" + description + c1.txtNIC.getText()+", "+c1.txtCusName.getText()+", "+ c1.cbxRoomType.getValue()+", "+c1.mealCbx.getValue()+", "+
                ", change=" + change +
                ", balance=" + balance +
                '}';
    }
}
