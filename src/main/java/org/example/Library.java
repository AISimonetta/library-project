package org.example;

import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library(List<Book> books) {
        this.bookList = books;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
