public class TestInheritance {
    public static void main(String[] args){

        Student one = new Student("Adnan", "Malibagh", 66, 2, 1);

        Teacher two = new Teacher("Ashraf", "Tungipara", "Proctor", 40000);

        one.show();
        two.show();
    }
}
