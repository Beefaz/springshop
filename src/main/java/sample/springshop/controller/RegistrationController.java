package sample.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sample.springshop.model.Users;
import sample.springshop.model.UsersDAO;

@Controller
public class RegistrationController {

    @Autowired
    UsersDAO usersDAO;

    @GetMapping("/registration")
    public String registration() { return "registration.jsp"; }

    @GetMapping("/addUser")
    public ModelAndView addUser(Users users) {
        usersDAO.save(users);
        ModelAndView modelAndView = new ModelAndView("/productView/products.jsp");
        modelAndView.addObject(users);
        return modelAndView;
    }

    @GetMapping("/getUser")
    public ModelAndView getUser(@RequestParam Long userId) {
        ModelAndView modelAndView = new ModelAndView("/productView/products.jsp");
        Users user = usersDAO.findById(userId).orElse(null);
        modelAndView.addObject(user);
        return modelAndView;
    }
}
