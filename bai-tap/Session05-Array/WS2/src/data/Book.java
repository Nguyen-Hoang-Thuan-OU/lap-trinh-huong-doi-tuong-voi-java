package data;

public class Book {

    private String isbn;
    private String bookName;
    private int releaseYear;
    private double bookPrice;

    public Book(String isbn, String bookName, int releaseYear, double bookPrice) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.releaseYear = releaseYear;
        this.bookPrice = bookPrice;
    }

    public String getIsbn() {
        return isbn;
    }

//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return String.format("| %-5s | %-10s | %4d | %6.1f |",
                isbn, bookName, releaseYear, bookPrice);
    }

    public void showBookInfo() {
        System.out.printf("| %-5s | %-10s | %4d | %6.1f |\n",
                isbn, bookName, releaseYear, bookPrice);
    }
}
