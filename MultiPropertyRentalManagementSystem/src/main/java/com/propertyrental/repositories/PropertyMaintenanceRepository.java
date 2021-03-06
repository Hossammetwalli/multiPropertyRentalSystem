package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.PropertyMaintenance;

@Repository
public interface PropertyMaintenanceRepository extends JpaRepository<PropertyMaintenance, Integer> {

}
