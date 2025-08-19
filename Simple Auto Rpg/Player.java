public class Player extends Character{
    
    public Player(double damage, double health) {

        super(damage, health);
    }

    @Override
    public double attack() {

        return this.getDamage() * MultiplierUtils.getRandomBuff();
    }
}
