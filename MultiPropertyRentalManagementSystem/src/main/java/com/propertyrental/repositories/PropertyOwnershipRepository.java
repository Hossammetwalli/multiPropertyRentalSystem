package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.PropertyOwnership;

@Repository
public interface PropertyOwnershipRepository extends JpaRepository<PropertyOwnership, Integer> {

}
