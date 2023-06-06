package com.repository;

import com.domain.entity.FoodEntity;
import com.domain.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity,Long> {
    List<FoodEntity> findFoodEntitiesByRestaurantEntityId(long id);
    FoodEntity findFoodEntityById(long id);
}
