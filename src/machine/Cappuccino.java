package machine;

public class Cappuccino extends Coffee {
    Cappuccino() {
        super(new Ingredients( 200, 100, 12, 1, 6));
    }
    @Override
    protected void printChildSpecific() {
        System.out.println("Pouring some milk into the cup");
    }
}
