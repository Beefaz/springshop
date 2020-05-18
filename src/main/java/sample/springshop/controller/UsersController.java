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
        ModelAndView modelAndView = new ModelAndView("redirect:/store/users");
        return modelAndView;
    }


    /*
    @GetMapping("/")
    public ModelAndView getUserPage(){
        Iterable<Users> listOfUsers= usersDAO.findAll();
        for (Users users : listOfUsers){
            System.out.println(users);
        }
        return new ModelAndView("index");
    }
    @GetMapping("/users")
    public String loaddashboard() { return "users.jsp"; }

    @GetMapping("/users/{userId}")
    public String getAllUsersByUserId(@PathVariable int userId) {
        return usersDAO.findById(userId).toString();
    }

    @GetMapping("/users/{userName}")
    public String getAllUsersByUserName(@PathVariable String userName) {
        return usersDAO.findAllByUserNameIsContaining(userName).toString();
    }
    */
}
