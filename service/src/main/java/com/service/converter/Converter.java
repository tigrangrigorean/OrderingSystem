package com.service.converter;

import com.domain.entity.*;
import com.domain.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {

    private  final ModelMapper modelMapper;

    @Autowired
    public Converter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    /**
     *
     * @param addressEntity
     * @return
     */
    public Address entityToAddress(AddressEntity addressEntity){
        return modelMapper.map(addressEntity,Address.class);
    }

    public AddressEntity addressToEntity(Address address){
        return modelMapper.map(address, AddressEntity.class);
    }

    public List<Address> entityToAddressList(List<AddressEntity> addressEntityList) {
        List<Address> addressList = addressEntityList
                .stream()
                .map(address -> modelMapper.map(address, Address.class))
                .collect(Collectors.toList());
        return addressList;
    }

    /**
     *
     * @param adminEntity
     * @return
     */
    public Admin entityToAdmin(AdminEntity adminEntity){
        return modelMapper.map(adminEntity,Admin.class);
    }

    public AdminEntity adminToEntity(Admin admin){
        return modelMapper.map(admin, AdminEntity.class);
    }

    public List<Admin> entityToAdminList(List<AddressEntity> adminEntityList){
        List<Admin> adminList = adminEntityList
                .stream()
                .map(admin -> modelMapper.map(admin, Admin.class))
                .collect(Collectors.toList());
        return adminList;
    }
    /**
     *
     * @param foodEntity
     * @return
     */
    public Food entityToFood(FoodEntity foodEntity){
        return modelMapper.map(foodEntity,Food.class);
    }

    public FoodEntity foodToEntity(Food food){
        return modelMapper.map(food, FoodEntity.class);
    }
    public List<Food> entityListToFoodList(List<FoodEntity> foodEntityList) {
        List<Food> foodList = foodEntityList
                .stream()
                .map(food -> modelMapper.map(food, Food.class))
                .collect(Collectors.toList());

        return foodList;
    }

    /**
     *
     * @param managerEntity
     * @return
     */
    public Manager entityToManager(ManagerEntity managerEntity){
        return modelMapper.map(managerEntity,Manager.class);
    }

    public ManagerEntity managerToEntity(Manager manager){
        return modelMapper.map(manager, ManagerEntity.class);
    }

    public List<Manager> entityToManagerList(List<ManagerEntity> managerEntityList){
        List<Manager> managerList = managerEntityList
                .stream()
                .map(manager -> modelMapper.map(manager, Manager.class))
                .collect(Collectors.toList());
        return managerList;
    }
    /**
     *
     * @param menuEntity
     * @return
     */
    public Menu entityToMenu(MenuEntity menuEntity){
        return modelMapper.map(menuEntity,Menu.class);
    }

    public MenuEntity menuToEntity(Menu menu){
        return modelMapper.map(menu, MenuEntity.class);
    }


    /**
     *
     * @param restaurantEntity
     * @return
     */
    public Restaurant entityToRestaurant(RestaurantEntity restaurantEntity){
        return modelMapper.map(restaurantEntity,Restaurant.class);
    }

    public RestaurantEntity restaurantToEntity(Restaurant restaurant){
        return modelMapper.map(restaurant, RestaurantEntity.class);
    }
    
    public List<Restaurant> entityListToRestaurantList(List<RestaurantEntity> restaurantEntityList) {
    	List<Restaurant> restaurantList = restaurantEntityList
    			  .stream()
    			  .map(restaurant -> modelMapper.map(restaurant, Restaurant.class))
    			  .collect(Collectors.toList());

    	return restaurantList;
    }

    /**
     *
     * @param userEntity
     * @return
     */
    public User entityToUser(UserEntity userEntity){
        return modelMapper.map(userEntity,User.class);
    }

    public UserEntity restaurantToEntity(User user){
        return modelMapper.map(user, UserEntity.class);
    }

    public List<User> entityToUserList(List<UserEntity> userEntityList){
        List<User> userList = userEntityList
                .stream()
                .map(user -> modelMapper.map(user, User.class))
                .collect(Collectors.toList());
        return userList;
    }


}
