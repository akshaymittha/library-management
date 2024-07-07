package com.example.service;

import com.example.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public List<Book> findAll();

    public Book findById(Long Id);

    public Book save(Book book);

    public void deleteById(long id);

    public Book borrowBook(Long bookId, Long userId);

    public Book returnBook(Long bookId);
}
