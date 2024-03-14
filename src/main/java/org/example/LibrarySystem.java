package org.example;

import java.util.List;

public class LibrarySystem {

    private static UserInteraction userInteraction = new UserInteraction();

    public static void performUserInteraction(List<Book> books, User user) {
        boolean isAdmin;
        do {
            isAdmin = userInteraction.greeting();

            if (isAdmin) {
                performAdminActions(books, user);
            } else {
                performUserActions(books, user);
            }
        } while (userInteraction.startAgain());
    }

    private static void performAdminActions(List<Book> books, User user) {
        while (true) {
            int choice = userInteraction.getUserChoiceForAdmin();
            switch (choice) {
                case 1:
                    userInteraction.showAllBooks(books);
                    break;
                case 2:
                    userInteraction.showLoanedBooks(user);
                    break;
                case 3:
                    reportBooksLoaned(books);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid. Please try again.");
            }
        }
    }


    private static void reportBooksLoaned(List<Book> books) {
        System.out.println("Books currently out on loan:");
        for (Book book : books) {
            if (!book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }

        System.out.println("\nBook loan count report:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ": " + book.getLoanCount() + " times");
        }
    }
    private static void performUserActions(List<Book> books, User user) {
        while (true) {

            int choice = userInteraction.getUserChoiceForUser();
            switch (choice) {
                case 1:
                    userInteraction.showAllBooks(books);
                    break;
                case 2:
                    userInteraction.loanBook(books, user);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid. Please try again.");
            }
        }
    }
}
