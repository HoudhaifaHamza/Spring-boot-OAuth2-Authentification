package com.aouth2.demo.controller;

import com.aouth2.demo.model.User;
import com.aouth2.demo.modelDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aouth2.demo.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/saveUser")
    @ResponseBody
    UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }


    @PostMapping("/deleteUser/{id}")
    @ResponseBody
    String deleteUser(@RequestBody Integer id) {
        return userService.deleteUser(id);
    }
}
