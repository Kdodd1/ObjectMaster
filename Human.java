public class Human {
    public String name;
    public int strength;
    public int intelligence;
    public int stealth;
    public int health;
    
    public Human(String name) {
        this.name = name;
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.health = 100;
        
    }
    public void attack(Human human) {
        Human attackedPlayer = human;
        int dps = this.strength;
        human.setHealth(-dps);
        System.out.println(this.getName() + " attacked " + attackedPlayer.getName() + " for " + dps + " damage!");

    }
    public void returnStats() {
        System.out.println("***********");
        System.out.println("Player Name: " + this.name);
        System.out.println("Strength: " + this.strength);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Stealth: " + this.stealth);
        System.out.println("Health: " + this.health);
        System.out.println("***********");
    }

    public int getStrength() {
        return this.strength;
    }
    public void setStrength(int delta) {
        this.strength += delta;
    }
    public int getIntelligence() {
        return this.intelligence;
    }
    public void setIntelligence(int delta) {
        this.intelligence += delta;
    }
    public int getStealth() {
        return this.stealth;
    }
    public void setStealth(int delta) {
        this.stealth += delta;
    }
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int delta) {
        this.health += delta;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}