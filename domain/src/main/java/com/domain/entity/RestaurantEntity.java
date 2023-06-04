package com.domain.entity;

import com.domain.model.Address;
import com.domain.model.Manager;
import com.domain.model.Menu;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String tin;
    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id")
    private AddressEntity address;
    @OneToOne
    private MenuEntity menu;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private ManagerEntity manager;
    private Date foundDate;
    private Date registrationDate;
    private String phoneNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public MenuEntity getMenu() {
        return menu;
    }

    public void setMenu(MenuEntity menu) {
        this.menu = menu;
    }

    public ManagerEntity getManager() {
        return manager;
    }

    public void setManager(ManagerEntity manager) {
        this.manager = manager;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RestaurantEntity() {
    }

    public RestaurantEntity(long id, String name, String tin, AddressEntity address, MenuEntity menu, ManagerEntity manager, Date foundDate, Date registrationDate, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.tin = tin;
        this.address = address;
        this.menu = menu;
        this.manager = manager;
        this.foundDate = foundDate;
        this.registrationDate = registrationDate;
        this.phoneNumber = phoneNumber;
    }
}
