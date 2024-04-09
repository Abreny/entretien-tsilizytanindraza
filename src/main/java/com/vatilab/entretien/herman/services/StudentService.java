package com.vatilab.entretien.herman.services;

import com.vatilab.entretien.herman.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student create(Student input);
    Student update(Long id, Student input);
    Student delete(Long id);
    List<Student> findAll();
    Optional<Student> findById(Long id);
}
