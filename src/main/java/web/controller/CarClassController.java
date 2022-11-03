package web.controller;

//import Service.Carservice;

import Service.CarserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class CarClassController {
    private CarserviceImpl carservice;
    CarserviceImpl carservices = new CarserviceImpl();


    @GetMapping("/cars")
    public String getAllCar(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carservices.getCars(count));
        return "cars";
    }


}
