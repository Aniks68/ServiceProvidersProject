package com.aniks.serviceprovidersproject.service;

import com.aniks.serviceprovidersproject.dto.MealRequest;
import com.aniks.serviceprovidersproject.dto.MealResponse;

public interface MealService {
    MealResponse addNewMeal(MealRequest meal);
}
