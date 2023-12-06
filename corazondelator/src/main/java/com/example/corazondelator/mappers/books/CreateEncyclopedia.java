package com.example.corazondelator.mappers.books;

import com.example.corazondelator.models.books.EncyType;
import com.example.corazondelator.models.books.Language;
import lombok.Data;

@Data
public class CreateEncyclopedia {
    private Long id;
    private String title;
    private String author;
    private String publicationyear;
    private String edition;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    private Language language;
    private EncyType encyType;
}
