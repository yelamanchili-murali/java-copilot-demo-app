package com.packagedelivery.tracker.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PackageDto {
    private String consignmentNumber;
    private String consigneeName;
    private GeoLocationDto deliveryAddress;
}