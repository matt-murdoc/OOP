public class Teacher extends MemberOfUniversity{
    
    private String designation;
    private double salary;

    public Teacher(String name, String address, String designation, double salary) {
        
        super(name, address);
        this.designation = designation;
        this.salary = salary;
    }
    
    @Override
    public void show() {
        System.out.printf("%s || %s || %s || %f\n", name, address, designation, salary);        
    }
}
