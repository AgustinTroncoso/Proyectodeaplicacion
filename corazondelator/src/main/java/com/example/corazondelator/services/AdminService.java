package com.example.corazondelator.services;

import com.example.corazondelator.models.User.AdminModel;
import com.example.corazondelator.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public ArrayList<AdminModel> searchUsers()
    {
       return( ArrayList<AdminModel>) adminRepository.findAll();

    }
}
