package com.example.yeniactivity.models;

public class DietModel {
    private int foodPicture;
    private String foodName;
    private String totalCalorie;
    private String foodDesc;

    public DietModel(int foodPicture,String foodName,String totalCalorie,String foodDesc){
        this.foodPicture=foodPicture;
        this.foodName=foodName;
        this.totalCalorie=totalCalorie;
        this.foodDesc=foodDesc;

    }

    public int getFoodPicture() {
        return foodPicture;
    }

    public void setFoodPicture(int foodPicture) {
        this.foodPicture = foodPicture;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getTotalCalorie() {
        return totalCalorie;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public void setTotalCalorie(String totalCalorie) {
        this.totalCalorie = totalCalorie;
    }
}
