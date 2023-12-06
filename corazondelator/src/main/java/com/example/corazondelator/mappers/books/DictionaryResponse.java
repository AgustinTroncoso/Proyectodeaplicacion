package com.example.corazondelator.mappers.books;

import com.example.corazondelator.models.books.DictCategory;
import com.example.corazondelator.models.books.Language;
import lombok.Data;

@Data
public class DictionaryResponse {
    private String title;
    private String author;
    private String publicationyear;
    private String edition;
    private String editor;
    private String imageUrl;
    private int stock;
    private int borrowStock;
    private Language language;
    private DictCategory dictCategory;
}
