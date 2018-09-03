package creator.builder.impl.burger;


public class VegtableBurger extends Burger{
    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 15.5f;
    }

}
