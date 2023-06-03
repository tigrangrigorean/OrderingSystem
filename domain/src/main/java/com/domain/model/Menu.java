package com.domain.model;

import java.util.List;


public class Menu {
    private List<Food> foodList;

    public Menu(List<Food> foodList) {
        this.foodList = foodList;
    }
    public Menu(){}

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
