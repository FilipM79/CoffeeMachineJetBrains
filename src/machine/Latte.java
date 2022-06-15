package machine;

public class Latte extends Coffee {
    Latte() {
        super(new Ingredients(350, 75, 20, 1, 7));
    }
    @Override
    protected void printChildSpecific() {
        System.out.println("Pouring some milk into the cup");
    }
}
