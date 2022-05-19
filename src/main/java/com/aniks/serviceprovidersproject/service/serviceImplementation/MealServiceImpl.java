package com.aniks.serviceprovidersproject.service.serviceImplementation;

import com.aniks.serviceprovidersproject.dto.MealRequest;
import com.aniks.serviceprovidersproject.dto.MealResponse;
import com.aniks.serviceprovidersproject.models.Meal;
import com.aniks.serviceprovidersproject.models.Restaurant;
import com.aniks.serviceprovidersproject.repository.MealRepository;
import com.aniks.serviceprovidersproject.repository.RestaurantRepository;
import com.aniks.serviceprovidersproject.service.MealService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealServiceImpl implements MealService {
    private final MealRepository mealRepository;
    private final RestaurantRepository restaurantRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MealServiceImpl(MealRepository mealRepository, RestaurantRepository restaurantRepository, ModelMapper modelMapper) {
        this.mealRepository = mealRepository;
        this.restaurantRepository = restaurantRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public MealResponse addNewMeal(MealRequest meal) {
        MealResponse response = new MealResponse();

        Restaurant sourceRestaurant = restaurantRepository.findByCityAndName(meal.getCity().toUpperCase(), meal.getRestaurant())
                .orElseThrow(() -> new NullPointerException("This restaurant does not exist"));

        boolean mealExists = mealRepository.findByNameAndDescriptionAndPrepTimeAndPriceAndRestaurant(meal.getName(), meal.getDescription(), meal.getPrepTime(), meal.getPrice(), sourceRestaurant)
                .isPresent();

        if (!mealExists) {
            response.setName(meal.getName());
            response.setDescription(meal.getDescription());
            response.setPrice(meal.getPrice());
            response.setPrepTime(meal.getPrepTime());
            if (meal.getImage() != null) {
                response.setImage(meal.getImage());
            }

            Meal newMeal = modelMapper.map(response, Meal.class);
            newMeal.setRestaurant(sourceRestaurant);
            mealRepository.save(newMeal);

            response.setRestaurantName(meal.getRestaurant());
        } else {
            return null;
        }

        return response;
    }
}
