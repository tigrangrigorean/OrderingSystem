package com.api.controller;

import com.domain.model.Restaurant;
import com.service.impl.RestaurantServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantServiceImpl restaurantServiceImpl;

    @Autowired
    public RestaurantController(RestaurantServiceImpl restaurantServiceImpl) {
        this.restaurantServiceImpl = restaurantServiceImpl;
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable("id") long id){
        return ResponseEntity.ok().body(restaurantServiceImpl.getById(id));
    }
    
    @GetMapping("")
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
    	return ResponseEntity.ok().body(restaurantServiceImpl.getAll());
    }
    
    
    @PostMapping("/save")
    public ResponseEntity<Restaurant> saveRestaurant(@RequestBody Restaurant restaurant) {
    	return ResponseEntity.ok().body(restaurantServiceImpl.save(restaurant));
    }
    
    @PatchMapping("/update")
    public ResponseEntity<String> updateRestaurantById(@RequestParam long id,@RequestBody Restaurant restaurant) {
    	restaurantServiceImpl.update(id,restaurant);
    	return ResponseEntity.ok().body("Restaurant by " + id + " updated successfully");
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteRestaurant(@RequestParam("id") long id) {
    	restaurantServiceImpl.delete(id);
    	return ResponseEntity.ok().body("Restaurant by " + id + " deleted successfully");
    }
}
