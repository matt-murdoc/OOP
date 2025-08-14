public class Library {
    private static Book[] storedBooks = new Book[100];
    private static int totalBooks = 0;

    public static int addBook(Book book) {

        storedBooks[totalBooks] = book;
        return totalBooks++;
    }

    public static int[] filterBooks(double price) {
        int count = 0;
        for (int i = 0; i < totalBooks; i++) {
            if (storedBooks[i].getPrice() < price) {
                count++;
            }
        }
        int[] id = new int[count];
        count = 0;
        for (int i = 0; i < totalBooks; i++) {
            if (storedBooks[i].getPrice() < price) {
                id[count++] = storedBooks[i].getBookId();
            }
        }
        return id;
    }

    public static void printAllBooks() {
        for (int i = 0; i < totalBooks; i++) {
            storedBooks[i].printDetails();
        }
    }
}