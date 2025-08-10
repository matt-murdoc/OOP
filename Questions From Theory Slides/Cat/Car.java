public class Car extends Vehicle{
    
    int number_of_wheel;
    int number_of_door;

    public Car(int speed, String color, int weight, int number_of_wheel, int number_of_door) {

        super(speed, color, weight);
        this.number_of_wheel = number_of_wheel;
        this.number_of_door = number_of_door;
    }

    void display() {

        System.out.println(speed + " || " + color + " || " +weight + " || " +number_of_wheel + " || " +number_of_door);
    }

}
