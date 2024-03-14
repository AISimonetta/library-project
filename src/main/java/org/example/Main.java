package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args)  {
        String filePath = "src/main/resources/books_data.csv";
        List<Book> books = CsvReader.readBooksFromCsv(filePath);
        Library library = new Library(books);
        UserInteraction userInteraction = new UserInteraction();
        User user = new User(false, "username", books.subList(0, 3));
        LibrarySystem.performUserInteraction(books, user);
    }
}

