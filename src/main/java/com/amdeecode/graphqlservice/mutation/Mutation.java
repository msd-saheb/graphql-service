package com.amdeecode.graphqlservice.mutation;

import com.amdeecode.graphqlservice.dto.Student;
import com.amdeecode.graphqlservice.service.StudentService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private StudentService studentService;

    public String create(Student student){
        Student student1 = studentService.create(student);
        return "Welcome "+student1.getFirstName()+" your age is "+student1.getAge()+" and gender is "+student1.getGender()+" and id is "+student1.getId();
    }
}
