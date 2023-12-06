package com.example.corazondelator.models.User;

import com.example.corazondelator.models.borrow.State;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String user;
    private String creationDate;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated(EnumType.STRING)
    private Position position;
}
