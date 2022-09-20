package com.amdeecode.graphqlservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id ;

    private String firstName ;

    private String age ;

    private String gender;
}
