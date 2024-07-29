package com.example.discovery_country.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReviewRequestForHomeHotel {
    @NotBlank(message = "can't be blank")
    String comment;

    float rating;
    String fullName;
    String photoUrl;
    Long homeHotelId;
    Long userId;
}