package com.example.repository;

import com.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Darwin on 9/10/2016.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
