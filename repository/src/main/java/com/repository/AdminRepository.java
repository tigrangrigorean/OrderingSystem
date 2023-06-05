package com.repository;

import com.domain.entity.AdminEntity;
import com.domain.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Long> {
}
