package sample.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sample.springshop.service.UserService;

@Controller
public class StoreController {

    @Autowired
    UserService userService;

    @GetMapping("/store")
    public String store() {
        return "store";
    }

    @GetMapping("/store/login")
    public String login() {
        return "login";
    }

    @GetMapping("/store/registration")
    public String registration() {
        return "registration";
    }

}
