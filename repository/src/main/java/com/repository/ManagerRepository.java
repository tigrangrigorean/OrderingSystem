package com.repository;

import com.domain.entity.ManagerEntity;
import com.domain.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<ManagerEntity,Long> {
    ManagerEntity findManagerEntityById(long id);
}
