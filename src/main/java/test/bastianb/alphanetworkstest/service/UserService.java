package test.bastianb.alphanetworkstest.service;

import java.util.List;

import test.bastianb.alphanetworkstest.models.User;

public interface UserService {
    
    List<User> getAllUser();
    User getUserById(Integer id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUserById(Integer id);
}