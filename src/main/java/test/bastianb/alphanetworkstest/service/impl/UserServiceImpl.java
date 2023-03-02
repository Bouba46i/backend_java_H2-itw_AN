package test.bastianb.alphanetworkstest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.bastianb.alphanetworkstest.models.User;
import test.bastianb.alphanetworkstest.repository.UserRepository;
import test.bastianb.alphanetworkstest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    
    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }
    
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

}
