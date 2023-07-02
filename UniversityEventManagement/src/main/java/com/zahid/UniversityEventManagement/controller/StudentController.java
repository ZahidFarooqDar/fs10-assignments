package com.zahid.UniversityEventManagement.controller;

import com.zahid.UniversityEventManagement.model.Student;
import com.zahid.UniversityEventManagement.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentServiceImpl studentServiceImpl;

    @PostMapping("/add-students")
    public ResponseEntity<Student> createStudent(@Validated @RequestBody Student student) {
        Student createdStudent = studentServiceImpl.createStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId) {
        Student student = studentServiceImpl.getStudentById(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentServiceImpl.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long studentId, @Validated @RequestBody Student student) {
        Student updatedStudent = studentServiceImpl.updateStudent(studentId, student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long studentId) {
        studentServiceImpl.deleteStudent(studentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


//    @PutMapping("custom/{id}")
//    public ResponseEntity<?> updateJobCustom(@PathVariable Long id, @RequestBody Student student) {
//        int rowsUpdated = studentServiceImpl.updateCustomDept(id, student);
//        if (rowsUpdated > 0) {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

//    @DeleteMapping("custom/{id}")
//    public ResponseEntity<?> deleteJobCustom(@PathVariable Long id) {
//        int rowsDeleted = studentServiceImpl.deleteStudentCustom(id);
//        if (rowsDeleted > 0) {
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

//    @PutMapping("/{id}/department")
//    public ResponseEntity<Object> updateStudentDepartment(@PathVariable Long id, @RequestParam Student.Department department) {
//        studentServiceImpl.updateStudentDepartment(id, department);
//        return ResponseEntity.noContent().build();
//    }
}
