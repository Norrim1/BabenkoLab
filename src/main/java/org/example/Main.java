package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws IOException {

        String jsonBooksStr = FileUtils.readFileToString(new File("books.json"), StandardCharsets.UTF_8);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        libraryVisitor visitor = gson.fromJson(jsonBooksStr, libraryVisitor.class);
        
    }
    }
