package com.example.usermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.usermanagement.model.UserManagementModel;
@Repository
public interface IRepository extends JpaRepository<UserManagementModel,Integer> {
    
}
