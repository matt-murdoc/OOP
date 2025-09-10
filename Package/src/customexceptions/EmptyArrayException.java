package customexceptions;

public class EmptyArrayException extends Exception{
    
    public EmptyArrayException() {

        super("The array is empty");
    }

    public EmptyArrayException(String messege) {

        super(messege);
    }
}