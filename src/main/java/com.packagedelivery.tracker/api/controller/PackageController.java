package com.packagedelivery.tracker.api.controller;

import com.packagedelivery.tracker.api.dto.PackageDto;
import com.packagedelivery.tracker.service.PackageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/packages")
public class PackageController {

    private final PackageService packageService;

    public PackageController(PackageService packageService) {
        this.packageService = packageService;
    }

    // return all packages
    @GetMapping("")
    public ResponseEntity<Iterable<PackageDto>> getAllPackages() {
        return new ResponseEntity<>(packageService.getAllPackages(), HttpStatus.OK);
    }
}