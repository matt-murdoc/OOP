import java.util.*;

public class SimpleAutoRPG {
    public static void main(String[] args) {
        
        Character p = new Player(10, 100);
        Character v = new Villain(10, 100);

        while(true) {

            p.takeDamage(v);

            v.takeDamage(p);
            
            System.out.print("Player Health: " + p.getHealth() + ", ");
            System.out.println("Villain Health: " + v.getHealth());

            if (p.getHealth() <= 0) {

                System.out.println("Player lost");
                break;
            }
            if (v.getHealth() <= 0) {

                System.out.println("Villain Lost");
                break;
            }
        }
    }
}
