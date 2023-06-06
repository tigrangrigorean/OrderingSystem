package com.domain.entity;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    private AddressEntity address;
    private Date birthday;
    private String phoneNumber;
    private String password;

    public UserEntity() {
    }

    public UserEntity(long id, String firstName, String lastName, AddressEntity address,
                      Date birthday, String phoneNumber, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
