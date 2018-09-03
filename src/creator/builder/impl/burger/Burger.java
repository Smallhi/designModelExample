package creator.builder.impl.burger;

import creator.builder.Item;
import creator.builder.Packing;
import creator.builder.impl.packing.Wrapper;

public abstract class Burger implements Item{

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
