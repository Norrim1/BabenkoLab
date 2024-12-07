package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.util.List;

@Log
@Setter
@Getter


public class libraryVisitor {
    String name;
    String surname;
    String phone;
    boolean subscribed;
    List<book> favoriteBooks;
    public libraryVisitor(final String name, final String surname, final String phone, final String isbn, final boolean subscribed, final List<book> favoriteBooks)
    {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.subscribed = subscribed;
        this.favoriteBooks = favoriteBooks;
    }
}
