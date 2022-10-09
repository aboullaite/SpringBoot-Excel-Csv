package me.aboullaite.controller;

import me.aboullaite.config.WebConfig;
import me.aboullaite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExportController {

    @Autowired
    private UserService userService;

    @Autowired
    private WebConfig webConfig;

    /**
     * Handle request to download an Excel document
     */
    @GetMapping("/download")
    public String download(Model model) {

        model.addAttribute("users", userService.findAllUsers());
        String[] header = {"FirstName", "LastName", "LastName", "JobTitle", "Company", "Address", "City", "Country",
                "PhoneNumber"};
        model.addAttribute("header",header);


        return "";
    }


}
