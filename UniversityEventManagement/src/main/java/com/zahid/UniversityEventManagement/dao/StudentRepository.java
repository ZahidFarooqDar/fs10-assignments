package com.zahid.UniversityEventManagement.dao;

import com.zahid.UniversityEventManagement.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Modifying
//    @Query(value = "UPDATE student s SET s.department = :department WHERE s.id = :id")
//    int updateJob(@Param("id") Long id, @Param("department") String department);
//
//    @Modifying
//    @Query(value = "DELETE FROM student s WHERE s.id = :id")
//    int deleteJob(@Param("id") Long id);

//    @Modifying
//    @Transactional
//    @Query("UPDATE Student s SET s.department = :department WHERE s.studentId = :id")
//    void updateStudentDepartment(@Param("id") Long studentId,@Param("department") Student.Department department);

//    @Modifying
//    //@Query(value = "update STOCK set STOCK_MARKET_CAP = :capPercentage where Stock_id = :id" , nativeQuery = true)
//    @Query(value = "UPDATE Student  SET department = :department WHERE s.studentId = :id", nativeQuery = true)
//    void updateMarketCapById(Double capPercentage, Integer id);

}
