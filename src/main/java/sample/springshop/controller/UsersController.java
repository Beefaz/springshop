package sample.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sample.springshop.model.Users;
import sample.springshop.repository.UserRepository;

@Controller
public class UsersController {
    @Autowired
    UserRepository userRepository;


    @GetMapping("/store/users")
    public ModelAndView getAllUsersPage() {
        Iterable<Users> usersList = userRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("ListOfUsers", usersList);
        return modelAndView;
    }
    @GetMapping("/store/users/adduser")
    public ModelAndView addUser(Users users) {
        userRepository.save(users);
        return new ModelAndView("redirect:/store/products");
    }

    @GetMapping("/store/user")
    public ModelAndView login() {
        return new ModelAndView("redirect:/store/products");
    }
/*
    @GetMapping("/store/user")
    public ModelAndView login(@RequestParam String userName, String userPassword) {
        List<Users> usersList = getAllUsersPage();
        usersList....
        return new ModelAndView("redirect:/store/products");
    }

 */
}
