package com.api.controller;

import com.domain.model.Food;
import com.domain.model.Restaurant;
import com.service.impl.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")

public class FoodController {
    private final FoodServiceImpl foodServiceImpl;

    @Autowired
    public FoodController(FoodServiceImpl foodServiceImpl) {
        this.foodServiceImpl = foodServiceImpl;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable("id") long id) {
        return ResponseEntity.ok().body(foodServiceImpl.getById(id));
    }

    @GetMapping("/getAllByMenuId")
    public ResponseEntity<List<Food>> getAllFood(long id) {
        return ResponseEntity.ok().body(foodServiceImpl.getAllByMenuId(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Food> saveFood(@RequestBody Food food) {
        return ResponseEntity.ok().body(foodServiceImpl.save(food));
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFoodById(@RequestParam long id,
                                                 @RequestBody Food food) {
        foodServiceImpl.update(id, food);
        return ResponseEntity.ok().body("Food by " + id + " updated successfully");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteFood(@RequestParam("id") long id) {
        foodServiceImpl.delete(id);
        return ResponseEntity.ok().body("Food by " + id + " deleted successfully");
    }

}
