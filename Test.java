public class Test {
    public static void main(String[] agrs){
        Wizard wizard1 = new Wizard("Gandalf");
        Ninja ninja1 = new Ninja("Tyler");
        Samurai samurai1 = new Samurai("Jack");
        wizard1.attack(ninja1);
        ninja1.returnStats();
    }
}