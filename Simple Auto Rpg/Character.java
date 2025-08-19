public abstract class Character {
    
    private double damage;
    private double health;
    
    public Character(double damage, double health) {
        this.damage = damage;
        this.health = health;
    }
    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public abstract double attack();

    public void takeDamage(Character obj) {

        obj.setHealth(obj.getHealth() - obj.attack());
    } 

}
