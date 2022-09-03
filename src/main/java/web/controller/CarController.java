package web.controller;

import Service.ServiceCarImpl;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer num, ModelMap model) {
        List<Car> carList;
        if (num != null) {
            carList = new ServiceCarImpl().findCars(num);
        } else {
            carList = new ServiceCarImpl().getCars();
        }
        model.addAttribute("carList", carList);
        return "Cars";
    }
}

