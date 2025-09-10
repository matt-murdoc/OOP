import java.io.FileNotFoundException;

public class Main {    
    public static void main(String[] args) {
        
        Word woman = new Word();
        PowerPoint nigga = new PowerPoint();

        try {
            
            woman.Open("app.doc");
        }
        catch(SecurityException se) {

            System.out.println("all niggas play football");
        }

        try {

            nigga.Open("jdkppt");
        }
        catch(FileNotFoundException fnfe) {

            System.out.println("all niggas play football");
        }
    }
}