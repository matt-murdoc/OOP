public class EmployeeTest {
    public static void main(String[] args) throws Exception {
        
        Employee adnan = new Employee("Adnan", "Hossain", 200000);
        Employee imran = new Employee("Imran", "Saleh", -40000);

        System.out.println("Yearly Salary: ");

        System.out.println();

        System.out.println(adnan.getFirstName() + ": " + adnan.getSalary() * 12);
        System.out.println(imran.getFirstName() + ": " + imran.getSalary() * 12);

        System.out.println();

        System.out.println("After Raise Yearly Salary: ");

        System.out.println();

        adnan.setSalary(adnan.getSalary() + adnan.getSalary() * 0.1);
        imran.setSalary(imran.getSalary() + imran.getSalary() * 0.1);

        System.out.println(adnan.getFirstName() + ": " + adnan.getSalary() * 12);
        System.out.println(imran.getFirstName() + ": " + imran.getSalary() * 12);
    }
}
