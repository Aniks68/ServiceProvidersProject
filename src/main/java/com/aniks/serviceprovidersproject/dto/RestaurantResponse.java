package com.aniks.serviceprovidersproject.dto;

import com.aniks.serviceprovidersproject.models.CITY;
import lombok.Data;

@Data
public class RestaurantResponse {
    private String name;
    private CITY city;
    private String emailAddress;
    private String phoneNumber;
    private String logo;
}
