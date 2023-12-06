package com.example.corazondelator.services;


import com.example.corazondelator.repositories.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowbookServices {
    @Autowired
    BorrowRepository borrowRepository;
}
