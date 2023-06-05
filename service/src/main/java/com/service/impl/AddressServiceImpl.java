package com.service.impl;

import com.domain.entity.AddressEntity;
import com.repository.AddressRepository;
import com.service.AddressService;
import com.domain.model.Address;
import com.service.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    private final Converter converter;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, Converter converter) {
        this.addressRepository = addressRepository;
        this.converter = converter;
    }


    @Override
    public Address getById(long id) {
        return converter.entityToAddress(addressRepository.findAddressEntityById(id));
    }

    @Override
    public List<Address> getAll() {
        return null;
    }

    @Override
    public AddressEntity save(Address address) {
        return addressRepository.save(converter.addressToEntity(address));
    }

    @Override
    public Address update(Address address) {
        return null;
    }

    @Override
    public void delete(long id) {
        addressRepository.deleteById(id);
    }
}
