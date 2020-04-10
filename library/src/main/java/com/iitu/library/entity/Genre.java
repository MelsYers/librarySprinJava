package com.iitu.library.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameGenre;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "GenreBook",
            joinColumns = {@JoinColumn(name="genre_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")}
    )
    private List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameGenre() {
        return nameGenre;
    }

    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", nameGenre='" + nameGenre + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
