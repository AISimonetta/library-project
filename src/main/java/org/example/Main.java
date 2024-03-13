package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "resources/book_data.csv";
        List<Book> books = CsvReader.readBooksFromCsv(filePath);

    }
}