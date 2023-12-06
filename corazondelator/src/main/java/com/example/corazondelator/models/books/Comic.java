package com.example.corazondelator.models.books;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String type;
    private String author;
    private String publicationyear;
    private String edition;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    @Enumerated(EnumType.STRING)
    private Genre genre;

}
