package org.example;

import java.util.List;
import java.util.Scanner;

public class UserInteraction {

    private Scanner scanner = new Scanner(System.in);

    public boolean greeting() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("* Welcome to the Library! If you are an administrator, please press 0; otherwise, press 1");
        int userType = scanner.nextInt();
        boolean isAdmin = (userType == 0);
        return isAdmin;
    }


    public int getUserChoiceForUser() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("* Please choose one of the following options: 1=Show all books, 2=Loan a book, 3=Exit ");
        return scanner.nextInt();
    }

    public int getUserChoiceForAdmin() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("* Please choose one of the following options: 1=Show all books, 2=Show loaned books,3=Run report, 4=Exit ");
        return scanner.nextInt();
    }

    public void showAllBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void showLoanedBooks(User user) {
        List<Book> borrowedBooks = user.getBorrowedBooks();
        if (borrowedBooks.isEmpty()) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("No borrowed books.");
        } else {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Books borrowed:");
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void loanBook(List<Book> books, User user) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Available books:");
        int bookNumber = 1;
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(bookNumber + ". " + book.getTitle() + " by " + book.getAuthor());
                bookNumber++;
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Enter the number of the book you want to loan:");
        int selectedBookNumber = scanner.nextInt();

        Book selectedBook = null;
        int count = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                count++;
                if (count == selectedBookNumber) {
                    selectedBook = book;
                    break;
                }
            }
        }

        if (selectedBook != null) {
            user.loanBook(selectedBook);
            selectedBook.setAvailable(false);
            selectedBook.increaseLoanCount();
            System.out.println("Book \"" + selectedBook.getTitle() + "\" has been loaned to " + user.getUsername());
        } else {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Book not found or already loaned.");
        }
    }


    public boolean startAgain() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("* Would you like to start again? (0 for No, 1 for Yes): ");
        return scanner.nextInt() == 1;
    }
}