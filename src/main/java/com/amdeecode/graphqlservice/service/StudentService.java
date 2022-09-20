package com.amdeecode.graphqlservice.service;

import com.amdeecode.graphqlservice.dto.Student;
import com.amdeecode.graphqlservice.entities.StudentEntity;
import com.amdeecode.graphqlservice.repo.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public Student findStudent(int id){
        Optional<StudentEntity> studentEntity = repository.findById(id);
        if(!studentEntity.isEmpty()) {
            StudentEntity data = studentEntity.get();
            return new Student(data.getId(), data.getFirstName(), data.getAge(), data.getGender());
        }
        throw new RuntimeException("No data found");
    }


    public Student create(Student student) {
        StudentEntity sE = modelMapper.map(student, StudentEntity.class);
        return modelMapper.map(repository.save(sE),Student.class);
    }
}
