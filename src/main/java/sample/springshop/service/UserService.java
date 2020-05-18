package sample.springshop.service;

import sample.springshop.model.Users;
import java.util.ArrayList;
import java.util.List;

public interface UserService {
    default List<Users> getAllUsers() {
        return new ArrayList<>();
    }
}
