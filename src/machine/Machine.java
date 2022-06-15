package machine;

import java.util.Scanner;

public class Machine {

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    private int money = 550;

    public void make(Coffee coffee) {
        if (water < coffee.ingredients.WATER) {
            System.out.println("Sorry, not enough water. Please fill the machine!\n");
        } else if (milk < coffee.ingredients.MILK) {
            System.out.println("Sorry, not enough milk. Please fill the machine!\n");
        } else if (coffeeBeans < coffee.ingredients.COFFEE_BEANS) {
            System.out.println("Sorry, not enough coffee beans. Please fill the machine!\n");
        } else if (cups < coffee.ingredients.CUPS) {
            System.out.println("Sorry, not enough disposable cups. Please fill the machine!\n");
        } else {
            water -= coffee.ingredients.WATER;
            milk -= coffee.ingredients.MILK;
            coffeeBeans -= coffee.ingredients.COFFEE_BEANS;
            cups -= coffee.ingredients.CUPS;
            money += coffee.ingredients.PRICE;
            coffee.make();
        }
    }

    public void takeMoney() {
        System.out.println("\nI gave you $" + money + "\n");
        money = 0;
    }

    public void refill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWrite how many ml of water to add:");
        System.out.print("> ");
        int addWater = scanner.nextInt();
        water += addWater;

        System.out.println("Write how many ml of milk to add:");
        System.out.print("> ");
        int addMilk = scanner.nextInt();
        milk += addMilk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        System.out.print("> ");
        int addCoffeeBeans = scanner.nextInt();
        coffeeBeans += addCoffeeBeans;

        System.out.println("Write how many disposable cups of coffee you want to add:");
        System.out.print("> ");
        int addCups = scanner.nextInt();
        cups += addCups;

        System.out.println("\n");
    }

    public void remaining() {
        System.out.println("\nThe coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans\n" +
                cups + " disposable cups\n" + "$" +
                money + " of money\n");
    }
}
