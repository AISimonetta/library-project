package org.example;

import java.util.List;
import java.util.Scanner;

public class UserCommands {

    private static UserInteraction userInteraction = new UserInteraction();

    public static void performUserInteraction(List<Book> books, User user) {
        boolean isAdmin = userInteraction.greeting();

        if (isAdmin) {
            performAdminActions(books, user);
        } else {
            performUserActions(books, user);
        }
    }

    private static void performAdminActions(List<Book> books, User user) {
        while (true) {
            int choice = userInteraction.getUserChoice();
            switch (choice) {
                case 1:
                    userInteraction.showAllBooks(books);
                    break;
                case 2:
                    if (user.isAdministrator()) {
                        userInteraction.showLoanedBooks(user);
                    } else {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("You are not an administrator, you do not have permission to view loaned books.");
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void performUserActions(List<Book> books, User user) {
        while (true) {
            int choice = userInteraction.getUserChoice();
            switch (choice) {
                case 1:
                    userInteraction.showAllBooks(books);
                    break;
                case 2:
                    userInteraction.loanBook(books, user);
                    break;
                case 3:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

