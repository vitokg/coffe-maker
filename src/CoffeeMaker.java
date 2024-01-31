public class CoffeeMaker {
    private Coffee coffee;

    public CoffeeMaker(Coffee coffee) {
        this.coffee = coffee;
    }

    public void makeCoffee() {
        coffee.makeCoffee();
    }
}
