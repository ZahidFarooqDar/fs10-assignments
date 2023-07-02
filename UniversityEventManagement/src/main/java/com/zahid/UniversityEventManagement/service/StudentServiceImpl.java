package com.zahid.UniversityEventManagement.service;

import com.zahid.UniversityEventManagement.dao.StudentRepository;
import com.zahid.UniversityEventManagement.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;


    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }


    public Student getStudentById(Long studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Long studentId, Student student) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setAge(student.getAge());
            existingStudent.setDepartment(student.getDepartment());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

//    @Transactional
//    public int updateCustomDept(Long id, String department) {
//        return studentRepository.updateJob(id, department);
//    }
//
//    //custom query
//    @Transactional
//    public int deleteStudentCustom(Long id) {
//        return studentRepository.deleteJob(id);
//    }

//    public void updateStudentDepartment(Long studentId, Student.Department department) {
//        studentRepository.updateStudentDepartment(studentId, department);
//    }


}
