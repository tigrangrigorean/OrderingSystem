package com.repository;

import com.domain.entity.AddressEntity;
import com.domain.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
    AddressEntity findAddressEntityById(long id);


}
