public class Samurai extends Human{
    private static int numberOfSamurai = 0;
    public Samurai(String name){
        super(name);
        this.health = 200;
        this.numberOfSamurai++;
        
    }
    public void deathBlow(Human attackedHuman) {
        int dps = attackedHuman.getHealth();
        attackedHuman.setHealth(-dps);
        int selfDamage = (this.health / 2);
        this.setHealth(-selfDamage);
        System.out.println(this.getName() + " killed " + attackedHuman.getName() + " ,but lost " + selfDamage + " health!");
    }

    public void meditate(){
        int heal = this.health / 2;
        this.setHealth(heal);
        System.out.println(this.getName() + " meditated and recovered " + heal + " health!" );
    }
    public void samuraiCount(){
        System.out.println("There are " + this.numberOfSamurai + " Samurai!");
    }

}