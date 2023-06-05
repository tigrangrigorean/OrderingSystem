package com.repository;

import com.domain.entity.FoodEntity;
import com.domain.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity,Long> {
}
