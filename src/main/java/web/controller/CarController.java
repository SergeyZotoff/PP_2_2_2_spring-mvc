package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "Granta", 2020));
        cars.add(new Car("Lada", "Granta", 2019));
        cars.add(new Car("Lada", "Granta", 2018));
        cars.add(new Car("Lada", "Granta", 2017));
        cars.add(new Car("Lada", "Granta", 2016));
        cars = CarService.carsCount(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
