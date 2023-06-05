package com.service.impl;

import com.domain.entity.MenuEntity;
import com.repository.AddressRepository;
import com.repository.MenuRepository;
import com.service.MenuService;
import com.domain.model.Menu;
import com.service.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    private final Converter converter;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository, Converter converter) {
        this.menuRepository = menuRepository;
        this.converter = converter;
    }

    @Override
    public Menu getById(long id) {
        return converter.entityToMenu(menuRepository.findMenuEntityById(id));
    }

    @Override
    public List<Menu> getAll() {
        return null;
    }

    @Override
    public MenuEntity save(Menu menu) {
        return menuRepository.save(converter.menuToEntity(menu));
    }

    @Override
    public Menu update(Menu menu) {
        return null;
    }

    @Override
    public void delete(long id) {
        menuRepository.deleteById(id);
    }
}
