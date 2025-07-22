import java.util.*;

public class EmployeeManagement {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int size = input.nextInt();

        Employee[] arr = new Employee[size];
        int[] holder = new int[size];

        System.out.println();

        for(int i = 0; i < size; i++) {

            arr[i] = new Employee();
            System.out.printf("Enter details for employee %d: ", i + 1);
            System.out.println();

            System.out.print("Name: ");
            arr[i].setName(input.next());
            System.out.println();

            System.out.print("ID: ");
            arr[i].setId(input.nextInt());
            System.out.println();

            System.out.print("Salary: ");
            arr[i].setSalary(input.nextDouble());
            System.out.println();
            
        }
        System.out.print("Enter a salary threshold: ");
        double cap = input.nextDouble();

        holder = EmployeeManager.filterEmployeeBySalary(arr, cap);
        
        int count = 0;
        for (int i = 0; i < size; i++) {

            if (holder[i] == 0) {
                
                count++;
                continue;
            }
            else System.out.println(holder[i]);
        }

        if (count == size) {

            System.out.printf("No employees found with salary higher than %f\n", (int)cap);
        }
    
    }
}
