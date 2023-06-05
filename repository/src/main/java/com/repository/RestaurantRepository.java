package com.repository;

import com.domain.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity,Long> {
    RestaurantEntity findRestaurantEntityById(long id);
}
