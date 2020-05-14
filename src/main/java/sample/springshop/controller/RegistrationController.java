package sample.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sample.springshop.model.Users;
import sample.springshop.model.UsersDAO;

@Controller
public class RegistrationController {

    @Autowired
    UsersDAO usersDAO;

    @RequestMapping("/registration")
    public String registration() {
        return "registration.jsp";
    }

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        usersDAO.save(users);
        return "registration.jsp";
    }

    @RequestMapping("/getUser")
    public ModelAndView getUser(@RequestParam int userId) {
        ModelAndView modelAndView = new ModelAndView("showuser.jsp");
        Users user = usersDAO.findById(userId).orElse(null);
        modelAndView.addObject(user);
        return modelAndView;
    }
}
