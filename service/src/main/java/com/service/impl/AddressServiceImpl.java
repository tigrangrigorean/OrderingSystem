package com.service.impl;

import com.domain.entity.AddressEntity;
import com.repository.AddressRepository;
import com.service.AddressService;
import com.domain.model.Address;
import com.service.converter.Converter;
import com.service.validator.Validator;
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
        Validator.checkId(id);
        Validator.checkEntity(addressRepository.findAddressEntityById(id));
        return converter.entityToAddress(addressRepository.findAddressEntityById(id));
    }

    @Override
    public List<Address> getAll() {
        return converter.entityToAddressList(addressRepository.findAll());
    }

    @Override
    public Address save(Address address) {
        Validator.checkEntity(address);
        addressRepository.save(converter.addressToEntity(address));
        return address;
    }

    @Override
    public void update(long id, Address address) {
        Validator.checkId(id);
        AddressEntity addressEntity = addressRepository.findAddressEntityById(id);
        Validator.checkEntity(address);
        Validator.checkEntity(addressEntity);

        if (address.getCity() != null) {
            addressEntity.setCity(address.getCity());
        }
        if (address.getStreet() != null) {
            addressEntity.setStreet(address.getStreet());
        }
        if (address.getBuilding() != null) {
            addressEntity.setBuilding(address.getBuilding());
        }

        if (address.getApartment() != null) {
            addressEntity.setApartment(address.getApartment());
        }

        addressRepository.save(addressEntity);
    }

//    @Override
//    public void delete(long id) {
//        Validator.checkId(id);
//        if (Validator.checkEntity(addressRepository.findAddressEntityById(id))) {
//            addressRepository.deleteById(id);
//        }
//    }
}
