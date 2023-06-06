package com.service.impl;

import com.domain.entity.FoodEntity;
import com.repository.FoodRepository;
import com.service.FoodService;
import com.domain.model.Food;
import com.service.converter.Converter;
import com.service.validator.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
	
    private final FoodRepository foodRepository;
    private final Converter converter;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository, Converter converter) {
        this.foodRepository = foodRepository;
        this.converter = converter;
    }

    @Override
    public Food getById(long id) {
    	Validator.checkId(id);
    	Validator.checkEntity(foodRepository.findFoodEntityById(id));
        return converter.entityToFood(foodRepository.findFoodEntityById(id));
    }


    @Override
    public Food save(Food food) {
    	Validator.checkEntity(food);
    	Validator.checkPrice(food.getPrice());
        foodRepository.save(converter.foodToEntity(food));
        return food;
    }

    @Override
    public void update(long id, Food food) {
        FoodEntity foodEntity = foodRepository.findFoodEntityById(id);
        
        	Validator.checkEntity(food);
            if (food.getName() != null) {
                foodEntity.setName(food.getName());
            }
            if (food.getIngredient() != null) {
                foodEntity.setIngredient(food.getIngredient());
            }
            if (Validator.checkPrice(id)) {
                foodEntity.setPrice(food.getPrice());
        }
        foodRepository.save(foodEntity);
    }

    @Override
    public void delete(long id) {
    	Validator.checkId(id);
    	Validator.checkEntity(foodRepository.findFoodEntityById(id));
        foodRepository.deleteById(id);
    }

    @Override
    public List<Food> getAllByMenuId(long id) {
        return converter.entityListToFoodList(foodRepository.findFoodEntitiesByMenuId(id));
    }
}
