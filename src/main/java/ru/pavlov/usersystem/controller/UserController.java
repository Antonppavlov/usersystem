package ru.pavlov.usersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.pavlov.usersystem.model.User;
import ru.pavlov.usersystem.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private @ResponseBody
    List<User> getAllUser() {
        return userService.getUserDao();
    }


    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ModelAndView validateUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("users_check_page");
        return modelAndView;
    }


    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody
    boolean check(@ModelAttribute("userFromServer") User user) {
        return userService.getUserDao().contains(user);
    }

//    @RequestMapping(value = "/check", method = RequestMethod.POST)
//    public @ResponseBody
//    boolean check(@RequestBody User user) {
//        return userService.getUserDao().contains(user);
//    }
}
