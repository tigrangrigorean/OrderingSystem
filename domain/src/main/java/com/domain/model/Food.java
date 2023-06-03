package com.domain.model;

import java.util.List;


public class Food {


    private String name;
    private List<String> ingredient;
    private double price;

    public Food(String name, List<String> ingredient, double price) {
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;
    }
    public Food(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<String> ingredient) {
        this.ingredient = ingredient;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
