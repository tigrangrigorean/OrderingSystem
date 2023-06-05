package com.service;


import com.domain.model.Food;

import java.util.List;

public interface FoodService {
    Food getById(long id);
    List<Food> getAll();
    Food save(Food food);
    Food update(Food food);
    void delete(long id);
}
