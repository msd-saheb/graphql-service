package com.amdeecode.graphqlservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class StudentResponse {

    private int id ;

    private String name;

    private String gender;

    private List<String> stringList;

    private String fullName;

    public StudentResponse(int id, String name, String gender, List<String> stringList) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.stringList = stringList;
    }
}
