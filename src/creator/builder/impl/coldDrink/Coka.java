package creator.builder.impl.coldDrink;

public class Coka extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 8f;
    }
}
