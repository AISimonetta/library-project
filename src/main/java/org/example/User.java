package org.example;

import java.util.List;

public class User {

    //Variables

    private boolean isAdministrator;
    private String username;
    private String password;
    private List<Book> borrowedBooks;

    //Constructor
    public User(boolean isAdministrator, boolean isNotAdministrator, String username, String password, List<Book> borrowedBooks) {
        this.isAdministrator = isAdministrator;
        this.username = username;
        this.password = password;
        this.borrowedBooks = borrowedBooks;
    }

    //Getters and setters

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    //Methods

    public void loanBook(Book book) {
    }

    public void displayLoanedBooks() {
    }
}