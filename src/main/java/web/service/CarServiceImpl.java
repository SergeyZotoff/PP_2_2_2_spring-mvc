package web.service;

import web.DAO.DaoCarsImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
public class CarServiceImpl implements CarService {

    private final DaoCarsImpl carService = new DaoCarsImpl();

     public  List<Car> carsCount(List<Car> cars, int number) {
        if (number == 0 || number > 5) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarList(int counter) {
        return carService.getCarList();
    }
}


