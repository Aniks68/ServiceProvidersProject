package com.aniks.serviceprovidersproject.dto;

import lombok.Data;

@Data
public class MealRequest {
    private String name;
    private String description;
    private Long price;
    private Long prepTime;
    private String image;
    private String city;
    private String restaurant;

}
