package com.library.main.servlet;

import com.library.Book.Book;
import com.library.Book.BookItem;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class ContextListener {
    private static SessionFactory sessionFactory;
    public static void main(String[] args){
        try{
           sessionFactory=new Configuration().configure().buildSessionFactory();
        }catch(Throwable ex){
            System.err.println("failed to create sessionFactory object."+ex);
            throw new ExceptionInInitializerError(ex);
        }
        Book book = new Book();


    }
}
