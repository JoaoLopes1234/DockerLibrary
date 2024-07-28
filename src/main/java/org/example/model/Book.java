package org.example.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
/*@Entity
@Table(name = "books")*/
public class Book {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Long price;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishDate;


    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    // Construtores, Getters e Setters
    public Book() {
    }

    public Book(Long id, String title, String author, String isbn, LocalDate publishDate, Long price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publishDate = publishDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
