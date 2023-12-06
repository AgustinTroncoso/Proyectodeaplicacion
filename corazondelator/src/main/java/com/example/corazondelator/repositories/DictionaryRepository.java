package com.example.corazondelator.repositories;

import com.example.corazondelator.models.books.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary,Long> {



}