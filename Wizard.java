public class Wizard extends Human {
    public Wizard(String name){
        super(name);
        this.health = 50;
        this.intelligence = 8;
        
    }
    public void heal(Human human) {
        Human healedHuman = human;
        healedHuman.setHealth(this.intelligence);
        System.out.println(this.getName() + " has healed " + healedHuman.getName() + " for " + this.intelligence + "!");
    }
    public void fireBall(Human human) {
        Human attackedHuman = human;
        int dps = (this.intelligence * -3);
        attackedHuman.setHealth(dps);
        System.out.println(this.getName() + " fireballed " + attackedHuman.getName() + " for " + (dps) + " damage!");
    }
}