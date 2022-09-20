package com.amdeecode.graphqlservice.query;

import com.amdeecode.graphqlservice.dto.Student;
import com.amdeecode.graphqlservice.dto.StudentResponse;
import com.amdeecode.graphqlservice.service.StudentService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private StudentService studentService;

    public String firstQuery(){
        return "Welcome to first graphql query";
    }

    public String secondQuery(String name){
        return "Welcome "+ name +" from Second graphql query";
    }

    public String thirdQuery(int id){
        Student student1 = studentService.findStudent(id);
        return "Welcome "+student1.getFirstName()+" your age is "+student1.getAge()+" and gender is "+student1.getGender()+" and id is "+student1.getId();
    }

    public StudentResponse findById(int id){
        return new StudentResponse(id, "saheb", "male", Collections.emptyList());
    }
}
