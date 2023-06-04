package com.service;

import com.domain.model.Manager;

import java.util.List;

public interface ManagerService {
    Manager getById(long id);
    List<Manager> getAll();
    Manager save(Manager manager);
    Manager update(Manager manager);
    void delete(long id);
}
