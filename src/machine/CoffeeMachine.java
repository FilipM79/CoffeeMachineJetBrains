package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine();

        String actionInput;
        String buyInput;
        int exit = 0;

        while (exit != 1) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            System.out.print("> ");
            actionInput = scanner.next();

            switch (actionInput) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? " +
                            " 1 - espresso, 2 - latte, 3 - cappuccino\n" +
                            " back - to main menu:");
                    System.out.print("> ");
                    buyInput = scanner.next();

                    switch (buyInput) {
                        case "1":
                            Espresso espresso = new Espresso();
                            machine.make(espresso);
                            break;

                        case "2":
                            Latte latte = new Latte();
                            machine.make(latte);
                            break;

                        case "3":
                            Cappuccino cappuccino = new Cappuccino();
                            machine.make(cappuccino);
                            break;

                        case "back":
                            System.out.println();
                            break;

                        default:
                            System.out.println("\nWrong input, try again!\n");
                            break;
                    }
                    break;

                case "fill":
                    machine.refill();
                    break;

                case "take":
                    machine.takeMoney();
                    break;

                case "remaining":
                    machine.remaining();
                    break;

                case "exit":
                    exit = 1;
                    break;

                default:
                    System.out.println("\nWrong input, try again!\n");
                    break;
            }
        }
    }
}
