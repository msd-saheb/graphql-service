package com.amdeecode.graphqlservice.query;

import com.amdeecode.graphqlservice.dto.StudentResponse;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class ResolverCustom implements GraphQLResolver<StudentResponse> {

    public String getFullName(StudentResponse studentResponse, MyEnumFilter filter) {
        if (filter.name().contains("JAVA"))
            return "Saheb studying Java";
        else if (filter.name().contains("SPRING_BOOT"))
            return "Saheb studying SPRING_BOOT";
        else if (filter.name().contains("AWS"))
            return "Saheb studying AWS";
            return studentResponse.getName() + "Ahmad";
    }
}
