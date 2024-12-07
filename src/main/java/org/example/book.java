package org.example;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

@Getter
@Setter
@Log
@Builder

public class book
{
    String name;
    String author;
    int publishingYear;
    String isbn;
    String publisher;


    public book(final String name, final String author, final int publishingYear, final String isbn, final double price, final String publisher)
    {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.isbn = isbn;
        this.publisher = publisher;
    }
}
