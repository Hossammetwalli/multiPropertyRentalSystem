package com.propertyrental.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.Country;

@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
