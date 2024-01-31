import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        displayMenu();
        try {
            int choice = getChoice();
            CoffeeFactory coffeeFactory = getCoffeeFactory(choice);
            Coffee coffee = coffeeFactory.createCoffee();
            CoffeeMaker coffeeMaker = new CoffeeMaker(coffee);
            coffeeMaker.makeCoffee();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    static void displayMenu() {
        System.out.println("Choose a drink:\n 1 - Espresso\n 2 - Cappuccino\n 3 - Latte");
    }

    static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static CoffeeFactory getCoffeeFactory(int choice) {
        switch (choice) {
            case 1:
                return new EspressoFactory();
            case 2:
                return new CappuccinoFactory();
            case 3:
                return new LatteFactory();
            default:
                 throw new IllegalArgumentException("Wrong choice!");
        }
    }
}
