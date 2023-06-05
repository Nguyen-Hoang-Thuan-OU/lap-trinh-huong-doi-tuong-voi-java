package main;

import data.Book;
import data.BookStore;
import java.util.Scanner;

public class Stage {

    public static void main(String[] args) {
        int choice = 0;
        String isbn;
        Scanner sc = new Scanner(System.in);

        BookStore nhaNam = new BookStore("GREEN", "NN", 10);

        do {
            printMenu();

            System.out.print("\t-> Please choose (0..7): ");
            choice = Integer.parseInt(sc.nextLine());
            System.out.println("");

            switch (choice) {
                case 0:
                    System.out.println("\nBye bye, see you later!\n");

                    break;

                case 1:
                    nhaNam.addABook();
                    System.out.println("");

                    break;

                case 2:
                    nhaNam.addBookList();
                    System.out.println("");

                    break;

                case 3:
                    System.out.println("Book list");
                    nhaNam.showBookList();
                    System.out.println("");

                    break;

                case 4:
                    nhaNam.sortBookList();

                    System.out.println("Book list in ascending");
                    nhaNam.showBookList();
                    System.out.println("");

                    break;

                case 5:
                    System.out.print("Input ISBN to start finding: ");
                    isbn = sc.nextLine();
                    System.out.println("");

                    if (nhaNam.returnABookForSearching(isbn) != null) {
                        System.out.println("Book found!");
                        nhaNam.returnABookForSearching(isbn).showBookInfo();
                    } else {
                        System.out.println("Book not found!");
                    }

                    System.out.println("");

                    break;

                case 6:
                    System.out.println("Book list");
                    nhaNam.showBookList();
                    System.out.println("");

                    System.out.print("Choose ISBN that you want to update: ");
                    isbn = sc.nextLine();
                    System.out.println("");

                    menuUpdateInfo();
                    System.out.print("\t-> Please choose (1..4): ");
                    choice = Integer.parseInt(sc.nextLine());
                    System.out.println("");

                    Book t = nhaNam.returnABookForSearching(isbn);
                    t.showBookInfo();

                    nhaNam.updateABook(t, choice);
                    System.out.println("");

                    System.out.println("Book list after update");
                    nhaNam.showBookList();
                    System.out.println("");

                    break;

                case 7:
                    System.out.println("Book list");
                    nhaNam.showBookList();
                    System.out.println("");

                    System.out.print("Choose ISBN that you want to delete: ");
                    isbn = sc.nextLine();
                    System.out.println("");

                    t = nhaNam.returnABookForSearching(isbn);

                    nhaNam.deleteABook(t);
                    System.out.println("");

                    System.out.println("Book list after delete");
                    nhaNam.showBookList();
                    System.out.println("");

                    break;

                default:
                    System.out.println("\nPlease choose 0..7\n");
            }

        } while (choice != 0);
    }

    public static void printMenu() {
        System.out.println("\n----- BOOK STORE");
        System.out.println("1. Input a book");
        System.out.println("2. Input book list");
        System.out.println("3. Show book list");
        System.out.println("4. Sort book list by ISBN (Ascending)");
        System.out.println("5. Search a book by ISBN");
        System.out.println("6. Update a book");
        System.out.println("7. Remove a book by ISBN");
        System.out.println("0. Quit");
    }

    public static void menuUpdateInfo() {
        System.out.println("\nWhat infomation do you want to update?");
        System.out.println("1. Book name");
        System.out.println("2. Release year");
        System.out.println("3. Book price");
        System.out.println("4. All");
        System.out.println("(* NOTE: ISBN can not be updated!)");
    }
}
