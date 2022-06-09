package model;

public class Meal {
    private String mealNo;
    private String mealType;
    private String mealName;
    private String mealPrice;

    public Meal() {
    }

    public Meal(String mealNo, String mealType, String mealName, String mealPrice) {
        this.mealNo = mealNo;
        this.mealType = mealType;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
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

    @Override
    public String toString() {
        return "Meal{" +
                "mealNo='" + mealNo + '\'' +
                ", mealType='" + mealType + '\'' +
                ", mealName='" + mealName + '\'' +
                ", mealPrice='" + mealPrice + '\'' +
                '}';
    }
}
