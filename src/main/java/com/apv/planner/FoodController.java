package com.apv.planner;

import com.apv.planner.business.FoodBusinessLogic;
import com.apv.planner.business.IFoodBusinessLogic;
import com.apv.planner.model.bean.food.RecipeBean;
import com.apv.planner.model.dao.food.IRecipeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class FoodController {

    @Autowired
    IFoodBusinessLogic foodBusinessLogic;

    @RequestMapping(path = "/food", method = RequestMethod.GET)
    String food() {
        return "Hello Welcome to Food controller!";
    }

    //@RequestMapping("/recipes")
    @RequestMapping(path = "/recipes", produces =MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    List<RecipeBean> recipes() {
        return foodBusinessLogic.getRecipes();
    }
}
