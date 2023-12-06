package com.example.corazondelator.mappers.books;

import com.example.corazondelator.models.books.Language;
import lombok.Data;

@Data
public class CreateNewspaper {
    private Long id;
    private String title;
    private String brand;
    private String publicationyear;
    private String editor;
    private String edition;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    private Language language;
}
