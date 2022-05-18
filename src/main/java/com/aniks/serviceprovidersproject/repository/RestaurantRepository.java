package com.aniks.serviceprovidersproject.repository;

import com.aniks.serviceprovidersproject.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findByCity(String city);
    Optional<Restaurant> findByCityAndName(String city, String name);
}
