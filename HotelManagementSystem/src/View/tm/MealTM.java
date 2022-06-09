package View.tm;

import javafx.scene.control.Button;

public class MealTM {
    private String mealNo;
    private String mealType;
    private String mealName;
    private String mealPrice;
    private Button btn;

    public MealTM() {
    }

    public MealTM(String mealNo, String mealType, String mealName, String mealPrice, Button btn) {
        this.mealNo = mealNo;
        this.mealType = mealType;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.btn = btn;
    }

    public String getMealNo() {
        return mealNo;
    }

    public void setMealNo(String mealNo) {
        this.mealNo = mealNo;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "MealTM{" +
                "mealNo='" + mealNo + '\'' +
                ", mealType='" + mealType + '\'' +
                ", mealName='" + mealName + '\'' +
                ", mealPrice='" + mealPrice + '\'' +
                ", btn=" + btn +
                '}';
    }
}
