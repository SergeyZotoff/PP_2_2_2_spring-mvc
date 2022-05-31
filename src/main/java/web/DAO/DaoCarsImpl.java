package web.DAO;

import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DaoCarsImpl implements DaoCars{

    @Override
    public List<Car> getCarList() {
        int count = 5;
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "Granta", 2020));
        cars.add(new Car("Lada", "Granta", 2019));
        cars.add(new Car("Lada", "Granta", 2018));
        cars.add(new Car("Lada", "Granta", 2017));
        cars.add(new Car("Lada", "Granta", 2016));
        cars = CarServiceImpl.carsCount(cars, count);
        return cars;
    }
}
