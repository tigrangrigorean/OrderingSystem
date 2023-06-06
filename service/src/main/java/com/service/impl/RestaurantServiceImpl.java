package com.service.impl;

import com.repository.RestaurantRepository;
import com.service.RestaurantService;
import com.domain.entity.RestaurantEntity;
import com.domain.model.Restaurant;
import com.service.converter.Converter;
import com.service.validator.Validator;

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
    	Validator.checkId(id);
    	Validator.checkEntity(restaurantRepository.findRestaurantEntityById(id));
        return converter.entityToRestaurant(restaurantRepository.findRestaurantEntityById(id));
    }

    @Override
    public List<Restaurant> getAll() {
        return converter.entityListToRestaurantList(restaurantRepository.findAll());
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
    	Validator.checkEntity(restaurant);
    	restaurantRepository.save(converter.restaurantToEntity(restaurant));
        return restaurant;
    }

    @Override
    public void update(long id,Restaurant restaurant) {
    	Validator.checkId(id);
    	RestaurantEntity restaurantEntity = restaurantRepository.findRestaurantEntityById(id);
        Validator.checkEntity(restaurant);
        Validator.checkEntity(restaurantEntity);
        	if(restaurant.getName() != null) {
        		restaurantEntity.setName(restaurant.getName());
        	}
        	if(restaurant.getTin() != null) {
        		restaurantEntity.setTin(restaurant.getTin());
        	}
        	if(restaurant.getAddress() != null) {
        		restaurantEntity.setAddress(converter.addressToEntity(restaurant.getAddress()));
        	}
        	if(restaurant.getMenu() != null) {
        		restaurantEntity.setMenu(converter.menuToEntity(restaurant.getMenu()));
        	}
        	if(restaurant.getManager() != null) {
        		restaurantEntity.setManager(converter.managerToEntity(restaurant.getManager()));
        	}
        	if(restaurant.getFoundDate() != null) {
        		restaurantEntity.setFoundDate(restaurant.getFoundDate());
        	}
        	if(restaurant.getRegistrationDate() != null) {
        		restaurantEntity.setRegistrationDate(restaurant.getRegistrationDate());
        	}
        	if(restaurant.getPhoneNumber() != null) {
        		restaurantEntity.setPhoneNumber(restaurant.getPhoneNumber());
        	
        }
        restaurantRepository.save(restaurantEntity);
    }

    @Override
    public void delete(long id) {
    	Validator.checkId(id);
    	if(Validator.checkEntity(restaurantRepository.findRestaurantEntityById(id))) {
    		 restaurantRepository.deleteById(id);
    	}
    }
}
