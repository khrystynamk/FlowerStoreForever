package com.lab.flowerstore.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<AppUser> listUsers() {
        return userService.getUsers();
    }

    @PostMapping(value = "/add", 
                headers = "content-type=text/json",
                consumes = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody AppUser user) {
        // if (!userService.findUserByEmail(user.getEmail()).isPresent()) {
            userService.add(user);
        // } else {
        //     System.out.println("There is already a user with such email!");
        // }
    }
}

    // To add to a table: echo '{"id": "1", "email": "wow@wow.com", "dateOfBirth": "27.03.1993"}' | curl -H "Content-Type: application/json" -d @- http://localhost:8080/api/user/add

