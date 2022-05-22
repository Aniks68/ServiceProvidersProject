package com.aniks.serviceprovidersproject.service;

import com.aniks.serviceprovidersproject.dto.RestaurantRequest;
import com.aniks.serviceprovidersproject.dto.RestaurantResponse;

import java.util.List;

public interface RestaurantService {
    RestaurantResponse addRestaurant(RestaurantRequest restaurant);
    List<RestaurantResponse> getAll();
}
