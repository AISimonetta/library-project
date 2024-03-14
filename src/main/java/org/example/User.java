package org.example;

import java.util.List;

public class User {
    private boolean isAdministrator;
    private String username;
    private List<Book> borrowedBooks;

    public User(boolean isAdministrator, boolean isNotAdministrator, String username, List<Book> borrowedBooks) {
        this.isAdministrator = isAdministrator;
        this.username = username;
        this.borrowedBooks = borrowedBooks;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }

    public void setAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void loanBook(Book book) {
        borrowedBooks.add(book);
        book.setAvailable(false);
    }
}
