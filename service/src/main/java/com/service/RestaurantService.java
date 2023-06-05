package com.service;

import com.domain.entity.RestaurantEntity;
import com.domain.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant getById(long id);
    List<Restaurant> getAll();
    RestaurantEntity save(Restaurant restaurant);
    Restaurant update(Restaurant restaurant);
    void delete(long id);
}
