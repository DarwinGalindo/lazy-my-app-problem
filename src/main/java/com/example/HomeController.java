package com.example;

import com.example.model.Author;
import com.example.model.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Darwin on 9/10/2016.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    private ModelAndView index() {
        List<Author> authorList = authorRepository.findAll();

        return new ModelAndView("home");
    }

    @GetMapping("/books")
    private ModelAndView viewBooks() {
        List<Book> bookList = bookRepository.findAll();
        return new ModelAndView("books");
    }

}
