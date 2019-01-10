public class Test {
    public static void main(String[] agrs){
        Wizard wizard1 = new Wizard("Gandalf");
        Ninja ninja1 = new Ninja("Tyler");
        Ninja ninja2 = new Ninja("Kyle");
        Samurai samurai1 = new Samurai("Jack");
        wizard1.attack(ninja1);
        // ninja1.returnStats();
        // wizard1.returnStats();
        wizard1.heal(ninja1);
        wizard1.fireBall(ninja1);
        ninja1.returnStats();
        // ninja2.returnStats();
        ninja1.steal(samurai1);
        ninja1.runAway();
        samurai1.deathBlow(ninja1);
        samurai1.meditate();
        ninja1.returnStats();
        samurai1.returnStats();
        samurai1.samuraiCount();
    }
}