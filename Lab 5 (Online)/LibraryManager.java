import java.util.Scanner;

public class LibraryManager {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        System.out.print("Number of Books: ");
        int want=input.nextInt();

        Book[] austlibrary=new Book[want];

        for(int i=0; i<austlibrary.length; i++){

            austlibrary[i] = new Book();

            System.out.print("Book " + (i + 1) +" Id: ");
            austlibrary[i].setBookId(input.nextInt());

            System.out.print("Book " + (i + 1) +" Price: ");
            austlibrary[i].setPrice(input.nextDouble());

            input.nextLine();

            System.out.print("Book " + (i + 1) +" Title: ");
            austlibrary[i].setTitle(input.nextLine());


        }

        System.out.println();
        
        System.out.print("Filter Price: ");
        int[] holder= BookHelper.filterByPrice(austlibrary, input.nextDouble());

        System.out.println();

        System.out.println("Filtered Book Id: ");
        
        for(int i = 0; i < want; i++) {

            if (holder[i] != 0) {

                System.out.println(holder[i]);
            }
        }

        System.out.println();

        BookHelper.printAllBooks(austlibrary);

        System.out.println();

        System.out.println("Total Books Created: " + Book.totalBooksCreated);

        
    }
}