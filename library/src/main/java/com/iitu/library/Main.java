package com.iitu.library;

import com.iitu.library.config.SpringConfig;
import com.iitu.library.repository.BookRepository;
import com.iitu.library.repository.GenreRepository;
import com.iitu.library.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);
        //System.out.println("bookRepository = " + bookRepository.findAll());
        GenreRepository genreRepository = context.getBean("genreRepository", GenreRepository.class);
        System.out.println("genreRepository.findAll() = " + genreRepository.findAll());

        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        System.out.println("userRepository.findAll() = " + userRepository.findAll());
    }
}
