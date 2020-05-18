package sample.springshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.springshop.model.Users;
import sample.springshop.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List <Users> getAllUsers(){
        List <Users> userList = new ArrayList<>();
        Iterable<Users> iterator = userRepository.findAll();
        if (iterator != null){
            for (Users users : iterator){
                userList.add(users);
            }
        }
        return UserService.super.getAllUsers();
    }
}
