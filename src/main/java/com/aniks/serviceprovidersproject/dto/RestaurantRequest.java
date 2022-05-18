package com.aniks.serviceprovidersproject.dto;

import com.aniks.serviceprovidersproject.models.CITY;
import lombok.Data;

@Data
public class RestaurantRequest {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private CITY city;
    private String logo;
}
