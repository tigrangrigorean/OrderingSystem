package com.service;


import com.domain.model.Food;

import java.util.List;

public interface FoodService {
    Food getById(long id);
    List<Food> getAllByMenuId(long id);
    Food save(Food food);
    void update(long id, Food food);

    void delete(long id);
}
