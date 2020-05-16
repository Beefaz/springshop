package sample.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sample.springshop.model.Users;
import sample.springshop.model.UsersDAO;

@Controller
public class LoginController {
    @Autowired
    UsersDAO usersDAO;

    @RequestMapping("/login")
    public String loadlogin() {
        return "login.jsp";
    }

    @RequestMapping("/login/{userName}")
    @ResponseBody
    public ModelAndView getUser(@RequestParam String userName) {
        ModelAndView modelAndView = new ModelAndView("/productView/products.jsp");
        Users users = usersDAO.findByUserName(userName);
        modelAndView.addObject(users);
        return modelAndView;
    }
}
