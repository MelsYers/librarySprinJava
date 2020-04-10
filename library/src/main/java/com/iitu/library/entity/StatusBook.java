package com.iitu.library.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class StatusBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @OneToMany(mappedBy = "statusBook")
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusBook{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
