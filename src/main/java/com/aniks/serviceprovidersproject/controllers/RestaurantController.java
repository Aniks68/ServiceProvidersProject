package com.aniks.serviceprovidersproject.controllers;

import com.aniks.serviceprovidersproject.dto.RestaurantRequest;
import com.aniks.serviceprovidersproject.dto.RestaurantResponse;
import com.aniks.serviceprovidersproject.models.Restaurant;
import com.aniks.serviceprovidersproject.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/restaurant")
@AllArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;

    @PostMapping("/add-new")
    public ResponseEntity<RestaurantResponse> addNewRestaurant(@RequestBody RestaurantRequest request) throws IOException {
        return ResponseEntity.ok(restaurantService.addRestaurant(request));
    }

    @GetMapping("/all")
    public ResponseEntity<List<RestaurantResponse>> getAllRestaurants() {
        return ResponseEntity.ok(restaurantService.getAll());
    }
}
