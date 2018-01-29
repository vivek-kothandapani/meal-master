package com.apv.planner;

import org.springframework.boot.SpringApplication;

public class StartService {
    public static void main(String[] args) throws Exception {
        Object[] controllers = {HomeController.class,UserController.class,FoodController.class};
        SpringApplication.run(controllers,args);
    }
}
