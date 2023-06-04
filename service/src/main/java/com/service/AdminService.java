package com.service;

import com.domain.model.Admin;

import java.util.List;

public interface AdminService {

    Admin getById(long id);
    List<Admin> getAll();
    Admin save(Admin admin) ;
    Admin update(Admin admin);
    void delete(long id);
}
