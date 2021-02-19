package com.propertyrental.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyrental.models.PropertyRecord;

@Repository
public interface PropertyRecordRepository extends JpaRepository<PropertyRecord, Integer> {

}
