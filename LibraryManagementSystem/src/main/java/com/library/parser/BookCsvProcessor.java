package com.library.parser;

import com.google.common.io.Resources;
import com.library.Book.Book;
import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookCsvProcessor {
    public List<Book>  loadBooks(String csvName) throws IOException {
//        Thread.currentThread().getContextClassLoader()
//                .getResourceAsStream(csvName);
        InputStream inputStream = Resources.getResource(csvName).openStream();

        InputStreamReader inputStreamReader= new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        List<Book> books = new ArrayList<>();
        try {
            CSVReader csvReader = new CSVReader(inputStreamReader);
            csvReader.forEach(r->{
                String id = Arrays.asList(r).get(0);
                String isbn = Arrays.asList(r).get(1);
                String name = Arrays.asList(r).get(2);
                Book book = new Book();
                book.setId(Long.valueOf(id));
                book.setISBN(isbn);
                book.setName(name);
                books.add(book);
            });
        } catch (Exception e){
            //do something
        }
        return books;
    }
}
