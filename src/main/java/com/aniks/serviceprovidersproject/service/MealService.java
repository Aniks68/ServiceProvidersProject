package com.aniks.serviceprovidersproject.service;

import com.aniks.serviceprovidersproject.dto.MealResponse;
import com.aniks.serviceprovidersproject.models.Meal;

public interface MealService {
    MealResponse addNewMeal(Meal meal);
}
