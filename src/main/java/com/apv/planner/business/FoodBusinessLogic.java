package com.apv.planner.business;

import com.apv.planner.model.bean.food.RecipeBean;
import com.apv.planner.model.dao.food.IRecipeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodBusinessLogic implements IFoodBusinessLogic {

    @Autowired
    IRecipeDao recipeDao;

    public List<RecipeBean> getRecipes(){
        return recipeDao.getRecipeList();
    }
}
