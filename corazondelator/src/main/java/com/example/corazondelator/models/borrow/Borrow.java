package com.example.corazondelator.models.borrow;

import com.example.corazondelator.models.books.Language;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerToBorrow;
    private String rutCustomerToBorrow;
    private String borrowedBook;
    private String borrowDate;
    private String returnDate;
    private String authorizedBy;
    private boolean passReturnDate;
    @Enumerated(EnumType.STRING)
    private State state;
}
