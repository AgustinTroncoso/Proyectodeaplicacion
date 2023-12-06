package com.example.corazondelator.mappers.books;

import com.example.corazondelator.models.books.Genre;
import lombok.Data;

@Data
public class ComicResponse {
    private String title;
    private String author;
    private String publicationyear;
    private String edition;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    private Genre genre;
}
