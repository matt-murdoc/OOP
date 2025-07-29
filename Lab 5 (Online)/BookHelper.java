public class BookHelper {
    
    static int[] filterByPrice(Book[] arr, double price) {

        int[] idArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {

            if (arr[i].getPrice() < price) {

                idArr[i] = arr[i].getBookId();
            }
        }

        return idArr;
    }

    static void printAllBooks(Book[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i].printDetails();
        }
    }
    
}