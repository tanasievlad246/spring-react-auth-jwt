package com.packt.reactspring.Controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.packt.reactspring.Entyties.Car;
import com.packt.reactspring.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarRepository repository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        return repository.findAll();
    }
}
