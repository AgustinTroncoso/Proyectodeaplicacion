package com.example.corazondelator.mappers;


import com.example.corazondelator.models.borrow.State;
import lombok.Data;

@Data
public class BorrowResponse {
    private String customerToBorrow;
    private String rutCustomerToBorrow;
    private String borrowedBook;
    private boolean passReturnDate;
    private State state;
}
