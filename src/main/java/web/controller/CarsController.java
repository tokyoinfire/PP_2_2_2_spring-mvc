package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDao;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/")
public class CarsController {

    private final CarServiceImpl carService;
    private final CarDao carDao;

    @Autowired
    public CarsController(CarServiceImpl carService, CarDao carDao) {
        this.carService = carService;
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getCarsFromList(count));
        return "cars";
    }
}
