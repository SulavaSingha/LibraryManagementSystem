package com.library.dao;

import com.library.Book.Book;

import java.util.List;

public interface BookDao {
    public void addBooks(List<Book> books);
    public void removeBook(Book book);
    public void updateBook(Book book);
    }
