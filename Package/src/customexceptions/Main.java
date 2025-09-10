package customexceptions;

import anotherpackage.*;

public class Main {
    public static void main(String[] args) {
        

        //-- Utils Test --//

        int[] arr = {1, 4, 6, 5, 7};
        
        try {
        
            Utils.calculateAverage(arr);
        }
        catch(Exception ex) {
    
            System.out.println(ex);
        }

        //-- Employee Test --//

        Employee obj = new Employee();

        
        try {

            obj.setName("em");
        }
        catch (TooShort ts) {

            System.out.println(ts);
        }

        try {

            obj.setId(0);
        }
        catch (idZero iz) {
            
            System.out.println(iz);
        }
        
        try {
            
            obj.setSalary(-2);
        }
        catch (salaryZero sz) {

            System.out.println(sz);
        }
    }
}