package com.service;

import com.domain.model.Address;

import java.util.List;

public interface AddressService {
    Address getById(long id);
    List<Address> getAll();
    Address save(Address address);
    Address update(Address address);
    void delete(long id);

}
