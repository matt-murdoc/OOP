public class PotionBrewer {


    Potion brewPotion (int volume1, int volume2) {

        Potion obj = new Potion(0, "Mixed");
        int sum = volume1 + volume2;

        if (sum > 200) {
            
            sum = 200; 
        }

        obj.setVolume(sum);
        return obj;

    }

    Potion brewPotion (Potion obj1, Potion obj2) {

        Potion obj = new Potion();

        obj.setVolume((obj1.getVolume() + obj2.getVolume()) / 2);

        if (obj1.getEffect().equals("Healing") && obj2.getEffect().equals("Strength")) {

            obj.setEffect("Invincibility");
        }
        else if ((obj1.getEffect().equals("Speed") && obj2.getEffect().equals("Neutral")) || (obj1.getEffect().equals("Neutral") && obj2.getEffect().equals("Speed"))) {

            obj.setEffect("Swiftness");
        }
        else obj.setEffect("unknown");

        return obj;
    }
}