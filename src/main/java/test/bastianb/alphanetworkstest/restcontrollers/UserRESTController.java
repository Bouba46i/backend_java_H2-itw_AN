package test.bastianb.alphanetworkstest.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.bastianb.alphanetworkstest.models.User;
import test.bastianb.alphanetworkstest.service.UserService;

@RestController
@RequestMapping("/user")
//@CrossOrigin
public class UserRESTController {
    
    @Autowired
    UserService userService;

    @RequestMapping(method=RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public User updateAnimal(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }
    
}
