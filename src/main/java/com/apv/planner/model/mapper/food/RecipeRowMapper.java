package com.apv.planner.model.mapper.food;

import com.apv.planner.model.bean.food.RecipeBean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipeRowMapper implements RowMapper<RecipeBean> {
    @Override
    public RecipeBean mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        RecipeBean bean = new RecipeBean();
        bean.setId(resultSet.getString("id"));
        bean.setName(resultSet.getString("name"));
        bean.setType(resultSet.getString("type"));
        bean.setCategory(resultSet.getString("category"));
        bean.setCountry(resultSet.getString("country"));
        return bean;
    }
}
