package machine;

public abstract class Coffee {
    Ingredients ingredients;
    Coffee(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    protected void make() {
        System.out.println("\nI have enough resources, making coffee!");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        printChildSpecific();
        System.out.println("Coffee is ready!\n");
    }

    protected void printChildSpecific() {
    }
}
