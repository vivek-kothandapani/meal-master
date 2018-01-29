package com.apv.planner.business;

import com.apv.planner.model.bean.food.RecipeBean;
import com.apv.planner.model.dao.food.RecipeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IFoodBusinessLogic {
    public List<RecipeBean> getRecipes();
}
