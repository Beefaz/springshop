package sample.springshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EshopController {

    @RequestMapping("/store")
    public String eshop() {
        return "store";
    }
}
