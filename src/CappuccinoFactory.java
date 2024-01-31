public class CappuccinoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}
