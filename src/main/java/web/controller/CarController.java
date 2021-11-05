package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CraSerbiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford",  1000, "green"));
        list.add(new Car("Ferrari", 700, "blue"));
        list.add(new Car("Aston Martin", 500, "white"));
        list.add(new Car("FIAT",  180, "pink"));
        list.add(new Car("BMW",  100, "shut color"));
        list = CraSerbiceImpl.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";

    }

}
