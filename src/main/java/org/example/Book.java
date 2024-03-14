package org.example;

public class Book {
    private int bookNumber;
    private String title;
    private String author;
    private String genre;
    private String subGenre;
    private String publisher;
    private boolean isAvailable;
    private int bookCounter;
    private int loanCount;


    public Book(int bookNumber, String title, String author, String genre, String subGenre, String publisher, boolean isAvailable, int bookCounter) {
        this.bookNumber = bookNumber;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.subGenre = subGenre;
        this.publisher = publisher;
        this.isAvailable = isAvailable;
        this.bookCounter = bookCounter;
        this.loanCount = 0;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getBookCounter() {
        return bookCounter;
    }

    public void setBookCounter(int bookCounter) {
        this.bookCounter = bookCounter;
    }

    public void increaseLoanCount() {
        this.loanCount++;
    }
    public int getLoanCount() {
        return loanCount;
    }
}
