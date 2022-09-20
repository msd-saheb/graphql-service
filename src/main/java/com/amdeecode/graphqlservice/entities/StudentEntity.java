package com.amdeecode.graphqlservice.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TBL_STUDENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue
    private int id ;

    @Column(name = "firstname")
    private String firstName ;

    @Column(name = "age")
    private String age ;

    @Column(name = "gender")
    private String gender;
}
