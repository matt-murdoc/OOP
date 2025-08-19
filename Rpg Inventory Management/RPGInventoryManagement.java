import java.util.*;

public class RPGInventoryManagement {
    
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        Health h = new Health();
        Health h1 = new Health();

        Stamina s = new Stamina();
        Stamina s1 = new Stamina();

        Inventory.addPotion(s);
        Inventory.addPotion(h);
        Inventory.addPotion(s1);
        Inventory.addPotion(h1);


        System.out.println("Potion to Activate: ");
        Inventory.activePotion(input.nextInt());

        System.out.println("Potion to Activate: ");
        Inventory.activePotion(input.nextInt());

    }
}