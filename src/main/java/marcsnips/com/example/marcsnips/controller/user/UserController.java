package marcsnips.com.example.marcsnips.controller.user;

import marcsnips.com.example.marcsnips.model.user.User;
import marcsnips.com.example.marcsnips.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser() {
        return userService.getUser();
    }

    @PostMapping(path = "add")
    public void createUser(@RequestBody List<User> user) {
        userService.createUser(user);
    }

    @DeleteMapping(path = "delete/{userId}")
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }

    @PutMapping(path = "update/{userId}")
    public void updateStudent(@PathVariable("userId") Long id,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String login,
                              @RequestParam(required = false) String pass1, @RequestParam(required = false) String pass2) {
            userService.updateUser(id,name,login,pass1,pass2);

    }
}
