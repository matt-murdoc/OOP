public class Student extends MemberOfUniversity{
    
    private int roll;
    private int semester;
    private int year;

    public Student(String name, String address, int roll, int semester, int year) {
        
        super(name, address);
        this.roll = roll;
        this.semester = semester;
        this.year = year;
    }
    
    @Override
    public void show() {
        System.out.printf("%s || %s || %d || %d || %d\n", name, address, roll, semester, year);        
    }
}
