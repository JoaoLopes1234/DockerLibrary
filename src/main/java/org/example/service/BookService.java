package org.example.service;

import org.example.model.Book;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public BookService() {
        // Adicionar alguns livros manualmente
        books.add(new Book(counter.incrementAndGet(), "Effective Java", "Joshua Bloch", "978-0134685991", LocalDate.of(2023, 1, 5) ,10L));
        books.add(new Book(counter.incrementAndGet(), "Clean Code", "Robert C. Martin", "978-0132350884", LocalDate.of(2020, 12, 1),5L));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void saveBook(Book book) {
        if (book.getId() == null) {
            book.setId(counter.incrementAndGet());
            books.add(book);
        } else {
            books = books.stream()
                    .map(b -> b.getId().equals(book.getId()) ? book : b)
                    .collect(Collectors.toList());
        }
    }

    public void deleteBook(Long id) {
        books = books.stream()
                .filter(book -> !book.getId().equals(id))
                .collect(Collectors.toList());
    }

    public Book getBookById(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

