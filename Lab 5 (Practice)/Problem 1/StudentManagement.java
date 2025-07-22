import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        
        Student[] arr = new Student[5];
        Scanner input = new Scanner(System.in);

        Student holder = new Student();
        
        System.out.println("Enter details for 5 students: ");
        System.out.println();

        for(int i = 0; i < 5; i++) {

            arr[i] = new Student();
            System.out.printf("Student %d Name: ", i + 1);
            arr[i].setName(input.next());

            System.out.printf("Student %d ID: ", i + 1);
            arr[i].setId(input.nextInt());
            
        }
        System.out.print("Enter the ID to search: ");
        int id = input.nextInt();
        holder = StudentManager.searchStudentById(arr, id);

        if (holder == null) {

            System.out.println("Student not found");
        }
        else System.out.println(holder.getName());
    }
       
}

