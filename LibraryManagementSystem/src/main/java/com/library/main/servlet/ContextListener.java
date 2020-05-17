package com.library.main.servlet;

import com.library.Book.Book;
import com.library.Book.BookItem;
import com.library.dao.BookDao;
import com.library.dao.BookDaoImpl;
import com.library.parser.BookCsvProcessor;
import com.library.util.HibernateUtil;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.List;

public class ContextListener {
    private static SessionFactory sessionFactory;
    public static void main(String[] args) throws IOException {
        BookCsvProcessor bookCsvProcessor= new BookCsvProcessor();
        List<Book> books = bookCsvProcessor.loadBooks("data/book.csv");
        BookDaoImpl bookDao = new BookDaoImpl();
        bookDao.addBooks(books);
    }
}
