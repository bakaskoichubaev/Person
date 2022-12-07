package Java8.service;

import Java8.clacces.Car;
import Java8.clacces.Person;

import java.util.List;

public interface CarService {
    String createCar(List<Car> cars);

    String removeCar(String name,List<Car>cars);

    List<Car>getAll();

    List<Person>findByName(String name, List<Person>people);

    List<Car>findByCountry(String name,List<Person>persons);
}
