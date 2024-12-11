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
    book[] favoriteBooks;
    public libraryVisitor()
    {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.subscribed = subscribed;
        this.favoriteBooks = favoriteBooks;
    }
    public void printPls()
    {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(phone);
        System.out.println(subscribed);
        for(book bookEx : favoriteBooks) {
            bookEx.printPlsHelp();
            System.out.println();
        }
        System.out.println();
    }
}
