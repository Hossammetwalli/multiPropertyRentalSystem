package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.PropertyBooking;

@Repository
public interface PropertyBookingRepository extends JpaRepository<PropertyBooking, Integer> {

}
