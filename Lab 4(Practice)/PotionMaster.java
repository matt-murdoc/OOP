import java.util.*;

public class PotionMaster {
        public static void main(String[] args) {
            
                Scanner input = new Scanner(System.in);

                Potion obj1 = new Potion();
                Potion obj2 = new Potion();
                Potion newObj = new Potion();
                Potion newObj2 = new Potion();

                PotionBrewer plate = new PotionBrewer();

                System.out.println("Potion 1");

                System.out.print("Volume: ");
                obj1.setVolume(input.nextInt());

                System.out.print("Effect: ");
                obj1.setEffect(input.next());;

                System.out.println();

                System.out.println("Potion 2");

                System.out.print("Volume: ");
                obj2.setVolume(input.nextInt());

                System.out.print("Effect: ");
                obj2.setEffect(input.next());;


                newObj = plate.brewPotion(obj1.getVolume(), obj2.getVolume());

                newObj2 = plate.brewPotion(obj1, obj2);

                System.out.println();

                System.out.println("New Potion 1");

                System.out.printf("Volume: %d\n", newObj.getVolume());
                System.out.printf("Effect: %s\n", newObj.getEffect());
        
                System.out.println();

                System.out.println("New Potion 2");

                System.out.printf("Volume: %d\n", newObj2.getVolume());
                System.out.printf("Effect: %s\n", newObj2.getEffect());
        }
}