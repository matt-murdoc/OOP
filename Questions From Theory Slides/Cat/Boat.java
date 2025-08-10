public class Boat extends Vehicle{
    
    int number_of_sail;
    int number_of_scull;

    Boat(int speed, String color, int weight, int number_of_sail, int number_of_scull) {

        super(speed, color, weight);
        this.number_of_sail = number_of_sail;
        this.number_of_scull = number_of_scull;     //Scull ki?
    }

    void display() {

        System.out.println(speed + " || " +color + " || " +weight + " || " +number_of_sail + " || " +number_of_scull);
    }
    
}
