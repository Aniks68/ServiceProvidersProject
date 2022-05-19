package com.aniks.serviceprovidersproject.repository;

import com.aniks.serviceprovidersproject.models.Meal;
import com.aniks.serviceprovidersproject.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    Optional<Meal> findByName(String name);
    Optional<Meal> findByNameAndDescriptionAndPrepTimeAndPriceAndRestaurant(String name, String description, Long prepTime, Long price, Restaurant restaurant);
}
