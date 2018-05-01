package me.aboullaite.controller.rest;

import me.aboullaite.model.User;
import me.aboullaite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private UserService userService;

    /**
     * Handle request to the default page
     */
    @GetMapping("/")
    public List<User> viewHome() {

        return userService.findAllUsers();
    }


}
