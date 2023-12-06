package com.example.corazondelator.models.books;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Encyclopedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String publicationyear;
    private String edition;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    @Enumerated(EnumType.STRING)
    private Language language;
    @Enumerated(EnumType.STRING)
    private EncyType EncyType;
}
