package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Main {
    public static void main(String[] args) throws IOException {

        String jsonBooksStr = FileUtils.readFileToString(new File("books.json"), StandardCharsets.UTF_8);
        System.out.print(jsonBooksStr);
        Gson gson = new Gson();
        libraryVisitor[] libraryVisitors = gson.fromJson(jsonBooksStr, (Type) libraryVisitor[].class);
        for(libraryVisitor visitor : libraryVisitors) {
            visitor.printPls();
        }
        for(libraryVisitor visitor : libraryVisitors) {
            visitor.printWithoutBooks();
        }
        System.out.println(libraryVisitors.length);
        List<book> books = new ArrayList<>();
        for(libraryVisitor visitor : libraryVisitors) {
            visitor.getFavoriteBooks();
            for(book bookExVisitor : visitor.favoriteBooks)
            {

                boolean passed = true;
                for(book bookExList : books)
                {
                    if(!Objects.equals(bookExVisitor.getIsbn(), bookExList.getIsbn())){}
                    else
                    {
                        passed = false;
                        break;
                    }
                }
                if(passed)
                {
                    books.add(bookExVisitor);
                }
            }
        }
        for(book bookEx : books)
        {
            bookEx.printPlsHelp();
        }
        System.out.print(books.size());
        System.out.println(" unique books");
        List<book> booksCopy = new ArrayList<>();

    }


}
