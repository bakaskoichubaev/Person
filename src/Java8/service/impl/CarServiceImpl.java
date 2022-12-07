package Java8.service.impl;

import Java8.clacces.Car;
import Java8.clacces.Person;
import Java8.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    List<Car>cars = new ArrayList<>();
    @Override
    public String createCar(List<Car> cars) {
        this.cars.addAll(cars);
        return "ВАША ОПЕРАЦИЯ ПРОШЛА УСПЕШНО!";
    }

    @Override
    public String removeCar(String name, List<Car> cars) {
        for (Car car : cars) {
            if(car.getName().equals(name)){
                this.cars.remove(car);
            }
        }
        return "ВАША ОПЕРАЦИЯ ПРОШЛА УСПЕШНО!";
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public List<Person> findByName(String name, List<Person> people) {
        List<Person> people1 = new ArrayList<>();
        for (Person person : people) {
            if(person.getName().equals(name)){
                people1.add(person);
                return people1;
            }
        }
        return null;
    }

    @Override
    public List<Car> findByCountry(String name, List<Person> persons) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCountryOfOrigin().name().equals(name.toUpperCase())){
                carList.add(car);

            }
        }
        return carList;
    }
}
