package com.example.discovery_country.model.dto.request;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RestaurantRequest {

    @NotBlank(message = "can't be blank")
    String name;

    @NotBlank(message = "can't be blank")
    String description;

    @NotBlank(message = "can't be blank")
    String address;

    @NotBlank(message = "can't be blank")
    String contact;

    String mapUrl;
    String menuUrl;
    Long regionId;
    Long imageId;
}