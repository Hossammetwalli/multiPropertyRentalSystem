package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.PropertyStatus;

@Repository
public interface PropertyStatusRepository extends JpaRepository<PropertyStatus, Integer> {

}
