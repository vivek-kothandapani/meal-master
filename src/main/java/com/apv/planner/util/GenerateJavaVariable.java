package com.apv.planner.util;

import com.google.common.base.CaseFormat;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class GenerateJavaVariable {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "id",
                "name" ,
                "type" ,
                "category" ,
                "class" ,
                "country"
        );
        for(String s : list){
            String camelCase = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, s);
            System.out.println(createDeclarations(camelCase, s));
        }

        for(String s : list){
            String camelCase = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, s);
            System.out.println(createBeanMappers(camelCase , s ));
        }


    }

    public static String createDeclarations(String s, String actualS){
        return "private String " + s + "; // " + actualS;
    }

    public static String createBeanMappers(String s, String actualS){
        return " bean.set" + StringUtils.capitalize(s) + "(resultSet.getString(\"" + actualS + "\"));";
    }
}
