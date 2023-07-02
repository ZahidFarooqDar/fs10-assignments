package com.zahid.UniversityEventManagement.service;

import com.zahid.UniversityEventManagement.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(Long studentId);
    List<Student> getAllStudents();
    Student updateStudent(Long studentId, Student student);
    void deleteStudent(Long studentId);
}
