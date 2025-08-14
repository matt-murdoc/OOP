import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many books do you want to add? ");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter Book ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            int result = Library.addBook(new Book(id, title, price));
            System.out.println();
        }

        System.out.println("\nAll Books:");
        Library.printAllBooks();

        System.out.print("\nEnter price to filter books: ");
        double filterPrice = scanner.nextDouble();
        int[] filteredId = Library.filterBooks(filterPrice);
        
        System.out.println();
        System.out.println("Books with price less than " + filterPrice + ":");
        for (int index : filteredId) {
            System.out.println(index);
        }

        scanner.close();
    }
}