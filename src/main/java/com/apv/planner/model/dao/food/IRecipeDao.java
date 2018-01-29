package com.apv.planner.model.dao.food;

import com.apv.planner.model.bean.food.RecipeBean;
import com.apv.planner.model.mapper.food.RecipeRowMapper;
import com.apv.planner.model.table.food.IRecipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRecipeDao {
    public List<RecipeBean> getRecipeList();
}
