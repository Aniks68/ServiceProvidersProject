package com.aniks.serviceprovidersproject.dto;

import lombok.Data;

@Data
public class MealResponse {
    private String name;
    private String description;
    private Long price;
    private Long prepTime;
    private String image;
    private String restaurantName;
}
