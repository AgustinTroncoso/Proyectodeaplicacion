package com.example.corazondelator.models.books;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Newspaper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String brand;
    private String publicationyear;
    private String editor;
    private String edition;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    @Enumerated(EnumType.STRING)
    private Language language;
}
