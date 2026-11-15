package com.harshal.car_crud_api.controller;

import com.harshal.car_crud_api.model.Car;
import com.harshal.car_crud_api.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){

        this.carService=carService;
    }

    @PostMapping("/car")
    public Car addcar(@RequestBody Car car ) {
// @RequestBody converts the JSON data to Java Object i.e. Car car
        return carService.addCar(car);
    }

//    @GetMapping("/test")
//    public Car test() {
//        return new Car(1, 1500000, "BMW");
//    }

    @GetMapping("/cars")
    public List<Car> getCars() {

        return carService.getCars();
    }

    @PutMapping("/car/{id}")
    public Car updateCar(@PathVariable int id,
                         @RequestBody Car updatedCar) {
//    @RequestBody : contains updated values.
        //@PathVariable : Takes value from URL.
        //Ex./employee/5 =  id = 5  
        return carService.updateCar(id,updatedCar);

    }

    @DeleteMapping("/car/{id}")
    public String deleteCar(@PathVariable int id) {

        return carService.deleteCar(id);
    }

}
