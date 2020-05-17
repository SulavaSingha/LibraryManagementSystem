package com.library.dao;

import com.library.Book.Book;
import com.library.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class BookDaoImpl implements BookDao{
private Session session;
    @Override
    public void addBooks(List<Book> books) {
        session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        books.forEach(book -> session.save(book));
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
    @Override
    public void removeBook(Book book) {

    }

    @Override
    public void updateBook(Book book) {

    }
}
