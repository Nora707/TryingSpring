package SpringBoot.Controller;

import SpringBoot.Entity.User;
import SpringBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUserByIs(@PathVariable("id") int id) {
         userService.removeUserById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
