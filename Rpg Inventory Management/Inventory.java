import java.util.*;

public class Inventory {
    
    private static ArrayList<Potion> potionsList = new ArrayList<>();

    public static void addPotion(Potion obj) {

        potionsList.add(obj);
        System.out.println("Number of Total Potion in the inventory: " + potionsList.size());

    }

    public static void activePotion(int index) {

        index = index - 1;

        if(index<1)
            System.out.println("Invalid Index");
        else if(index>potionsList.size())
            System.out.println("Invalid Index");
        else
            potionsList.get(index-1).addEffect();
    }


}
