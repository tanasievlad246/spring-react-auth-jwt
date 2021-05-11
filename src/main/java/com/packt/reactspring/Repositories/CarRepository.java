package com.packt.reactspring.Repositories;

import com.packt.reactspring.Entyties.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    // Fetch cars by brand
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);

    // Fetch cars by color
    List<Car> findByColor(String color);

    // Fetch cars by year
    List<Car> findByYear(int year);
}
