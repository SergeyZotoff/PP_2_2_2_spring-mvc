package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.DaoCarsImpl;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new CarServiceImpl().getCarList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
