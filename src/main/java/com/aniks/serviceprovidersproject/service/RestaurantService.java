package com.aniks.serviceprovidersproject.service;

import com.aniks.serviceprovidersproject.dto.RestaurantRequest;
import com.aniks.serviceprovidersproject.dto.RestaurantResponse;

public interface RestaurantService {
    RestaurantResponse addRestaurant(RestaurantRequest restaurant);
}
