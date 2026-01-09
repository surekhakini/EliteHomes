package com.estate.project.repositories;

import com.estate.project.models.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PropertyRepo extends JpaRepository<Property, Long> {
    List<Property> findByCityContainingIgnoreCase(String city);
}
