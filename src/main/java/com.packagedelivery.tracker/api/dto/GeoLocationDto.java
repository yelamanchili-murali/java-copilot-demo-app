package com.packagedelivery.tracker.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GeoLocationDto {
    private float latitude;
    private float longitude;
}