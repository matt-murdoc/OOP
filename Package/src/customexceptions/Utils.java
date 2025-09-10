package customexceptions;

public class Utils {
    
    public static float calculateAverage(int[] arr) throws EmptyArrayException{

        if (arr == null) {

            throw new EmptyArrayException();
        }

        int sum = 0;
        int count = 0;

        for(int i : arr) {

            sum += arr[i];
            count++;
        }

        float avg = (float) sum / count;

        return avg;
    }
}
