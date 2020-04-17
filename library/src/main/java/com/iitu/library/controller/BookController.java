package com.iitu.library.controller;

import com.iitu.library.entity.Book;
import com.iitu.library.repository.BookRepository;
import com.iitu.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }



}
