package com.aniks.serviceprovidersproject.service.serviceImplementation;

import com.aniks.serviceprovidersproject.dto.MealResponse;
import com.aniks.serviceprovidersproject.models.Meal;
import com.aniks.serviceprovidersproject.repository.MealRepository;
import com.aniks.serviceprovidersproject.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealServiceImpl implements MealService {
    private final MealRepository mealRepository;

    @Autowired
    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public MealResponse addNewMeal(Meal meal) {
        return null;
    }
}
