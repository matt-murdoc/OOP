public class Villain extends Character{
    
    public Villain(double damage, double health) {

        super(damage, health);
    }

    @Override
    public double attack() {

        return this.getDamage() * MultiplierUtils.getRandomNerf();
    }
}
