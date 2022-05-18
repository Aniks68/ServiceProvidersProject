package com.aniks.serviceprovidersproject.service.serviceImplementation;

import com.aniks.serviceprovidersproject.dto.RestaurantRequest;
import com.aniks.serviceprovidersproject.dto.RestaurantResponse;
import com.aniks.serviceprovidersproject.models.Restaurant;
import com.aniks.serviceprovidersproject.repository.RestaurantRepository;
import com.aniks.serviceprovidersproject.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, ModelMapper modelMapper) {
        this.restaurantRepository = restaurantRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RestaurantResponse addRestaurant(RestaurantRequest restaurant) {
        RestaurantResponse response = new RestaurantResponse();

        response.setCity(restaurant.getCity());
        response.setName(restaurant.getName());
        response.setEmailAddress(restaurant.getEmailAddress());
        response.setPhoneNumber(restaurant.getPhoneNumber());
        if (restaurant.getLogo() != null) {
            response.setLogo(restaurant.getLogo());
        }

        final Restaurant newRestaurant = modelMapper.map(response, Restaurant.class);
        restaurantRepository.save(newRestaurant);
        return response;
    }
}
