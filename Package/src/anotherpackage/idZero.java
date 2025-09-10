package anotherpackage;

public class idZero extends Exception{
    
    public idZero() {

        super("Id cannot be zero");
    }

    public idZero(String messege) {

        super(messege);
    }
}
