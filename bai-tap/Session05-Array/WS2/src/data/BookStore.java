package data;

import java.util.Scanner;

public class BookStore {

    private String shelfColor;
    private String shelfLabel;
    private int shelfSize;

    private int count = 0;
    private Book bookList[];
    private static Scanner sc = new Scanner(System.in);

    public BookStore(String shelfColor, String shelfLabel, int shelfSize) {
        this.shelfColor = shelfColor;
        this.shelfLabel = shelfLabel;
        this.shelfSize = shelfSize;
        bookList = new Book[shelfSize];
    }

    public void addABook() {
        String isbn;
        String bookName;
        int releaseYear;
        double bookPrice;

        System.out.println("\nAdd book #" + (count + 1) + " / " + shelfSize);

        System.out.print("ISBN: ");
        isbn = sc.nextLine();

        System.out.print("Book name: ");
        bookName = sc.nextLine();

        System.out.print("Release year: ");
        releaseYear = Integer.parseInt(sc.nextLine());

        System.out.print("Book price: ");
        bookPrice = Double.parseDouble(sc.nextLine());

        bookList[count] = new Book(isbn, bookName, releaseYear, bookPrice);
        count++;
    }

    public void addBookList() {
        int numberOfBook = 0;

        System.out.print("Please input number of books: ");
        numberOfBook = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfBook; i++) {
            addABook();
        }
    }

    public Book showASpecificBook(int indexInArray) {
        return bookList[indexInArray - 1];
    }

    public void showBookList() {
        for (int i = 0; i < count; i++) {
            bookList[i].showBookInfo();
        }
    }

    public void sortBookList() {
        for (int i = 0; i < (count - 1); i++) {
            for (int j = i + 1; j < count; j++) {
                if (bookList[i].getIsbn().compareToIgnoreCase(bookList[j].getIsbn()) > 1) {
                    Book temp = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = temp;
                }
            }
        }
    }

    public Book returnABookForSearching(String isbn) {
        for (int i = 0; i < count; i++) {
            if (bookList[i].getIsbn().equalsIgnoreCase(isbn) == true) {
                return bookList[i];
            }
        }
        return null;
    }

    public int findIndexInArray(Book bookIndex) {
        for (int i = 0; i < count; i++) {
            if (bookList[i].equals(bookIndex) == true) {
                return i;
            }
        }
        return -1;
    }

    public void updateABook(Book bookIndex, int function) {
        String bookName;
        int releaseYear;
        double bookPrice;

        int selectBook = findIndexInArray(bookIndex);

        System.out.println("\nUpdate book #" + selectBook + " / " + shelfSize);
        switch (function) {
            case 1:
                System.out.print("New Book name: ");
                bookName = sc.nextLine();
                bookIndex.setBookName(bookName);

                break;

            case 2:
                System.out.print("New Release year: ");
                releaseYear = Integer.parseInt(sc.nextLine());
                bookIndex.setReleaseYear(releaseYear);

                break;

            case 3:
                System.out.print("New Book price: ");
                bookPrice = Double.parseDouble(sc.nextLine());
                bookIndex.setBookPrice(bookPrice);

                break;

            case 4:
                System.out.print("New Book name: ");
                bookName = sc.nextLine();
                bookIndex.setBookName(bookName);

                System.out.print("New Release year: ");
                releaseYear = Integer.parseInt(sc.nextLine());
                bookIndex.setReleaseYear(releaseYear);

                System.out.print("New Book price: ");
                bookPrice = Double.parseDouble(sc.nextLine());
                bookIndex.setBookPrice(bookPrice);

                break;
        }
    }

    public void deleteABook(Book bookIndex) {

        int selectBook = findIndexInArray(bookIndex);

        System.out.println("\nDelete book #" + selectBook + " / " + shelfSize);

        for (int i = selectBook; i < count; i++) {
            bookList[selectBook] = bookList[selectBook + 1];
        }
        count--;
    }
}
