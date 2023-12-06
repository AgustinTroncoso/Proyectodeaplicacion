package com.example.corazondelator.services;
import com.example.corazondelator.models.User.AdminModel;
import com.example.corazondelator.models.books.*;
import com.example.corazondelator.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksServices {

    @Autowired
    ComicRepository comicRepository;
    DictionaryRepository dictionaryRepository;
    EncyclopediaRepository encyclopediaRepository;
    NewspaperRepository newspaperRepository;
    ReadingBooksRepository readingBooksRepository;

    public ArrayList<Comic> comiclist() {
        return (ArrayList<Comic>) comicRepository.findAll();
    }

    public ArrayList<Dictionary> dictionarylist() {
        return (ArrayList<Dictionary>) dictionaryRepository.findAll();
    }

    public ArrayList<Encyclopedia> encyclopedialist() {
        return (ArrayList<Encyclopedia>) encyclopediaRepository.findAll();
    }

    public ArrayList<Newspaper> newspaperlist() {
        return (ArrayList<Newspaper>) newspaperRepository.findAll();
    }

    public ArrayList<ReadingBooks> readingBookslist() {
        return (ArrayList<ReadingBooks>) readingBooksRepository.findAll();
    }


    public List<Object> getAllData() {
        List<Object> combinedData = new ArrayList<>();
        combinedData.addAll(comicRepository.findAll());
        combinedData.addAll(dictionaryRepository.findAll());
        combinedData.addAll(encyclopediaRepository.findAll());
        combinedData.addAll(newspaperRepository.findAll());
        combinedData.addAll(readingBooksRepository.findAll());

        return combinedData;
    }
}
