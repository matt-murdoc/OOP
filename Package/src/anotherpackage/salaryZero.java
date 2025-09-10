package anotherpackage;

public class salaryZero extends Exception {
    
    public salaryZero() {

        super("Salary cannot be zero");
    }

    public salaryZero(String messege) {

        super(messege);
    }
}
