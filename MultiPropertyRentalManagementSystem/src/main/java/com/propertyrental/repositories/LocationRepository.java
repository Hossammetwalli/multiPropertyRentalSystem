package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
