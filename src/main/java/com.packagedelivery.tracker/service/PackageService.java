package com.packagedelivery.tracker.service;

import com.packagedelivery.tracker.api.dto.GeoLocationDto;
import com.packagedelivery.tracker.api.dto.PackageDto;
import com.packagedelivery.tracker.domain.Package;
import com.packagedelivery.tracker.repository.PackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PackageService {

    private final PackageRepository packageRepository;

    public PackageService(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    // return all packages
    public List<PackageDto> getAllPackages() {
        List<Package> packageEntities = packageRepository.findAll();
        return packageEntities.stream()
                .map(packageEntity -> new PackageDto(packageEntity.getConsignmentNumber(),
                                                        packageEntity.getConsigneeName(),
                                                        new GeoLocationDto(packageEntity.getDeliveryAddress().getLatitude(),
                                                                            packageEntity.getDeliveryAddress().getLongitude()
                                                    )))
                .collect(Collectors.toList());
    }
}