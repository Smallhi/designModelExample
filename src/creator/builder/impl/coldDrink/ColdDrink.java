package creator.builder.impl.coldDrink;

import creator.builder.Item;
import creator.builder.Packing;
import creator.builder.impl.packing.Bottle;

public abstract class ColdDrink implements Item{

    // 接口的方法可以不全部实现，这样类必须是抽象类？
    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
