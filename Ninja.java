public class Ninja extends Human {
    public Ninja(String name){
        super(name);
        this.stealth = 10;
        
    }
    public void steal(Human human){
        Human robbedHuman = human;
        robbedHuman.setHealth(this.stealth * -1);
        this.setHealth(this.stealth);
        System.out.println(this.getName() + " stole from " + robbedHuman.getName());
    }
    public void runAway(){
        this.setHealth(-10);
        System.out.println(this.getName() + " disapeared!");
    }
}