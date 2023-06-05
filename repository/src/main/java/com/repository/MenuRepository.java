package com.repository;

import com.domain.entity.MenuEntity;
import com.domain.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity,Long> {
    MenuEntity findMenuEntityById(long id);
}
