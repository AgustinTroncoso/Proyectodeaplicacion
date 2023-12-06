package com.example.corazondelator.mappers.books;

import com.example.corazondelator.models.books.Genre;
import com.example.corazondelator.models.books.Language;
import lombok.Data;

@Data
public class ReadingBooksResponse {
    private String title;
    private String author;
    private String publicationyear;
    private String edition;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    private Genre genre;
    private Language language;
}
