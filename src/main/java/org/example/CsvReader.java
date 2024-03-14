package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader {

    public static List<Book> readBooksFromCsv(String filePath) {
        List<Book> books = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                Book book = createBookFromCsv(data);
                books.add(book);
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }

    private static Book createBookFromCsv(String[] data) {
        int bookNumber = Integer.parseInt(data[0]);
        String title = data[1];
        String author = data[2];
        String genre = data[3];
        String subGenre = data[4];
        String publisher = data[5];
        boolean isAvailable = true;
        int bookCounter = 0;

        return new Book(bookNumber, title, author, genre, subGenre, publisher, isAvailable, bookCounter);
    }
}
