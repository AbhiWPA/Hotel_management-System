package model;

import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Bill {
    private DatePicker date;
    private TextArea description;
    private Label change;
    private Label balance;

    public Bill() {
    }

    public Bill(DatePicker date, TextArea description, Label change, Label balance) {
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
                ", description=" + description +
                ", change=" + change +
                ", balance=" + balance +
                '}';
    }
}
