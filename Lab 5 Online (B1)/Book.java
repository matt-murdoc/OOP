public class Book {
    private int bookId;
    private String title;
    private double price;

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public void setTitle(String title) { this.title = title; }
    public void setPrice(double price) { this.price = price; }

    public void printDetails() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Price: " + price);
    }
}