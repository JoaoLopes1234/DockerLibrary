package org.example.controller;

import org.example.model.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String viewBooksPage(Model model) {
        model.addAttribute("listBooks", bookService.getAllBooks());
        model.addAttribute("book", new Book());
        return "books";
    }

    @PostMapping("/books/save")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("listBooks", bookService.getAllBooks());
        return "books";
    }
}
