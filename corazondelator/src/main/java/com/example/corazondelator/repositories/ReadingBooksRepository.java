package com.example.corazondelator.repositories;

import com.example.corazondelator.models.books.ReadingBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingBooksRepository extends JpaRepository<ReadingBooks,Long> {



}