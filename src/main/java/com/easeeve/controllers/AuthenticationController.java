package com.easeeve.controllers;

import com.easeeve.dao.UserDao;
import com.easeeve.model.User;
import com.easeeve.model.requests.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthenticationController {
    @Autowired
    UserDao userDao;
    @RequestMapping(value = "testAuthenticationController")
    @ResponseBody
    public String testAuthenticationController(){
        return "Up and Working";
    }
    @RequestMapping(value="/authenticate", method = RequestMethod.POST)
    public String authenticateUser(@ModelAttribute("loginRequest") LoginRequest loginRequest){
        if(loginRequest.getUsername() != null && loginRequest.getPassword() != null) {
            String userName = loginRequest.getUsername();
            User user = userDao.getUserByUserName(userName);
            if(user == null){
                return "error";
            }
            else{
                return "testSuccess";
            }
        }
        else {
            return "error";
        }
    }
}
