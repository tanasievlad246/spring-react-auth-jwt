package com.packt.reactspring;

import com.packt.reactspring.Entyties.Car;
import com.packt.reactspring.Entyties.Owner;
import com.packt.reactspring.Repositories.CarRepository;
import com.packt.reactspring.Repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactSpringApplication {

	private static final Logger logger = LoggerFactory.getLogger(ReactSpringApplication.class);

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		// Testing server restart
		SpringApplication.run(ReactSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			// Add owner objects and save these to db
			Owner owner1 = new Owner(1, "John" , "Johnson");
			Owner owner2 = new Owner(2, "Mary" , "Robinson");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);

			// Add car object with link to owners and save these to db.
			Car car = new Car(1, "Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1);
			carRepository.save(car);
			Car car1 = new Car(2, "Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2);
			carRepository.save(car1);
			Car car2 = new Car(3, "Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2);
			carRepository.save(car2);
		};
	}
}
