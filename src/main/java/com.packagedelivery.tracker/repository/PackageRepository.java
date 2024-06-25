package com.packagedelivery.tracker.repository;

import com.packagedelivery.tracker.domain.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<Package, Long> {
    Package findByConsignmentNumber(String consignmentNumber);

    Package findByConsigneeName(String consigneeName);
}
