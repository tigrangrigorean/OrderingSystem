package com.service;

import com.domain.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant getById(long id);
    List<Restaurant> getAll();
    Restaurant save(Restaurant restaurant);
    void update(long id,Restaurant restaurant);
    void delete(long id);
}
