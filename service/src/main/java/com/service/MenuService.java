package com.service;

import com.domain.entity.MenuEntity;
import com.domain.model.Menu;

import java.util.List;

public interface MenuService {
    Menu getById(long id);
    List<Menu> getAll();
    MenuEntity save(Menu menu);
    Menu update(Menu menu);
    void delete(long id);
}
