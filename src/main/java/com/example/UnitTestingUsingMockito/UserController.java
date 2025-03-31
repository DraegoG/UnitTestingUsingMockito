package com.example.UnitTestingUsingMockito;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody UserModel user) {

        UserEntity userEntity = userService.addUser(user);
        return new ResponseEntity(userEntity, HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity getUsers() {
        List<UserEntity> userEntityList = userService.getAllUsers();
        return new ResponseEntity(userEntityList, HttpStatus.OK);
    }
}
