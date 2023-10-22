package com.example.amusementpark.data.food;

import java.util.UUID;

public class Food {
    private UUID FoodId;
    private String foodName;
    private double foodPrice;
    private FoodType foodType;

    public void setFoodId(UUID foodId) {
        FoodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public UUID getFoodId() {
        return FoodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
