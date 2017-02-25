package me.aboullaite.controller.rest;

import me.aboullaite.model.User;
import me.aboullaite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by aboullaite on 2017-02-23.
 */

@RestController
public class Api {

    @Autowired
    UserService userService;

    /**
     * Handle request to the default page
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> viewHome() {
        return userService.findAllUsers();
    }


}
