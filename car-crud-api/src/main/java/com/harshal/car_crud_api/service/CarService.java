    package com.harshal.car_crud_api.service;

    import com.harshal.car_crud_api.model.Car;
    import org.springframework.stereotype.Service;

    import java.util.ArrayList;
    import java.util.List;

    @Service
    public class CarService {

        private List<Car> cars = new ArrayList<>();

        //Accepts the Car object.
        public Car addCar(Car car) {

            //Adds it to arraylist.
            cars.add(car);
            return car;
            //Returns added car.
        }

        //Returns complete list.
        public List<Car>getCars() {

            return cars;

        }

        public Car updateCar(int id,Car updatedCar) {

            //Loop through every car.
            for(Car car :cars) {


                //Checks If  current car id match?
                if(car.getId() != null && car.getId() == id) {
                    car.setPrice(updatedCar.getPrice());
                    car.setCarBrand(updatedCar.getCarBrand());
                    //Updates brand.
                    return car;
                    //Returns updated car.
                }
            }

            return null;
        }

        public String deleteCar(int id) {

            for(Car car : cars) {

                if(car.getId() == id) {

                    cars.remove(car);
                    return "Car deleted";

                }
            }
            return "Car not found";
        }

    }
