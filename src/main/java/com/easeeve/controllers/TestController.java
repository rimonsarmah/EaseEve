package com.easeeve.controllers;

import com.easeeve.dao.UserDao;
import com.easeeve.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.time.Instant;

@Controller
public class TestController {
    private final Logger logger = Logger.getLogger(TestController.class);
    @Autowired
    UserDao userDao;
    @RequestMapping( "test")
    public String testGet(){
        /*logger.info("In test Controller");
        User user = new User();
        user.setUserName("rimon");
        user.setUserEmail("rimonsarmahjnv@gmail.com");
        user.setUserPassword("Test@12345");
        user.setUserType("admin");
        user.setCreatedTs(Timestamp.from(Instant.now()));
        try {
            System.out.println(userDao.addUser(user));
        }
        catch (Exception exception){
            logger.error("Some exception occured while adding user: " + exception.getMessage());
        }*/
        return "testSuccess";
    }
}
