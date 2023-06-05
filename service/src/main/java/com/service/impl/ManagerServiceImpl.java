package com.service.impl;

import com.domain.entity.ManagerEntity;
import com.repository.ManagerRepository;
import com.service.ManagerService;
import com.domain.model.Manager;
import com.service.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository managerRepository;

    private final Converter converter;

    @Autowired
    public ManagerServiceImpl(ManagerRepository managerRepository, Converter converter) {
        this.managerRepository = managerRepository;
        this.converter = converter;
    }


    @Override
    public Manager getById(long id) {
        return converter.entityToManager(managerRepository.findManagerEntityById(id));
    }

    @Override
    public List<Manager> getAll() {
        return null;
    }

    @Override
    public ManagerEntity save(Manager manager) {
        return managerRepository.save(converter.managerToEntity(manager));
    }

    @Override
    public Manager update(Manager manager) {
        return null;
    }

    @Override
    public void delete(long id) {
        managerRepository.deleteById(id);
    }
}
