package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {

}
