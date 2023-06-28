package com.example.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanagement.dao.IRepository;
import com.example.usermanagement.model.UserManagementModel;

@Service
public class UserManagementService {

    @Autowired
    IRepository repo;

    public UserManagementModel addUser(UserManagementModel user) {
        return repo.save(user);
    }

    public List<UserManagementModel> getAll() {
        return repo.findAll();
    }

    public UserManagementModel getUserById(int userId) {
        return repo.findById(userId).get();
    }

    public void updateUser(Integer userId, UserManagementModel newModel) {
        UserManagementModel ansModel = repo.findById(userId).get();
        ansModel.setUserName(newModel.getUserName());
        ansModel.setUserName(newModel.getUserName());
        ansModel.setMail(newModel.getMail());
        ansModel.setPhoneNumber(newModel.getPhoneNumber());
        ansModel.setDateOfBirth(newModel.getDateOfBirth());
        repo.save(ansModel);
    }

    public void deleteuser(int id) {
        UserManagementModel model = getUserById(id);
        repo.delete(model);
    }

}
