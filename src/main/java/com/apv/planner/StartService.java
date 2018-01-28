package com.apv.planner;

import com.apv.planner.controller.SampleController;
import org.springframework.boot.SpringApplication;

public class StartService {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
