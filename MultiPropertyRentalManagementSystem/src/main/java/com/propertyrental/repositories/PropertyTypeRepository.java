package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.PropertyType;

@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Integer> {

}
