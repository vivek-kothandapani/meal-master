package com.apv.planner.model.table.food;

public interface IRecipe extends IFood {

    String TABLE_NAME = IFood.SCHEMA_NAME + ".RECIPE";

    String SELECT_RECIPE_LIST = "select * from " + TABLE_NAME;
}
