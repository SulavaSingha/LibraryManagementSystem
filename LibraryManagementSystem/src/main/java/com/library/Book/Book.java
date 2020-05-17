package com.library.Book;

import com.library.enums.Genre;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
//@org.hibernate.annotations.NamedQuery(name="CREATE-BOOK",query="insert into Book values()")
@Entity
@Table(name = "book")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Book {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "c_id")
    private long id;
    @Column(name = "ISBN", nullable = false)
    private String ISBN;
    @Column(name = "name", nullable = false)
    private String name;
//    private Author author;
//    private Genre genre;
//    private Publisher publisher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
//
//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
//
//    public Publisher getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(Publisher publisher) {
//        this.publisher = publisher;
//    }
}
