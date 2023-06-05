package com.service.impl;

import com.domain.entity.RestaurantEntity;
import com.repository.RestaurantRepository;
import com.service.RestaurantService;
import com.domain.model.Restaurant;
import com.service.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final Converter converter;
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(Converter converter, RestaurantRepository restaurantRepository) {
        this.converter = converter;
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant getById(long id) {
        return converter.entityToRestaurant(restaurantRepository.findRestaurantEntityById(id));
    }

    @Override
    public List<Restaurant> getAll() {
        return null;
    }

    @Override
    public RestaurantEntity save(Restaurant restaurant) {
        return restaurantRepository.save(converter.restaurantToEntity(restaurant));
    }

    @Override
    public Restaurant update(Restaurant restaurant) {
        return null;
    }

    @Override
    public void delete(long id) {
        restaurantRepository.deleteById(id);
    }
}
