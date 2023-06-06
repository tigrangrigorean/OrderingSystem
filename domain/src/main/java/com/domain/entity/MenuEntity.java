package com.domain.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "menu")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "menu",
            cascade = CascadeType.REMOVE)
    private List<FoodEntity> food;

    public MenuEntity(long id, List<FoodEntity> foodEntities) {
        this.id = id;
        this.food = foodEntities;
    }

    public MenuEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<FoodEntity> getFoodEntities() {
        return food;
    }

    public void setFoodEntities(List<FoodEntity> foodEntities) {
        this.food = foodEntities;
    }
}
