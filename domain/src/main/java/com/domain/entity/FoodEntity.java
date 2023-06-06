package com.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String ingredient;
    @ManyToOne(
            cascade = CascadeType.REFRESH
    )
    @JoinColumn(name = "menu_id")
    private MenuEntity menu;

    private double price;


    public FoodEntity(long id, String name, String ingredient, double price,
                      MenuEntity menu) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
        this.price = price;

    }

    public FoodEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
