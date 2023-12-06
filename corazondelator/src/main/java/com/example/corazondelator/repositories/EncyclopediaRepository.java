package com.example.corazondelator.repositories;

import com.example.corazondelator.models.books.Encyclopedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncyclopediaRepository extends JpaRepository<Encyclopedia,Long> {



}