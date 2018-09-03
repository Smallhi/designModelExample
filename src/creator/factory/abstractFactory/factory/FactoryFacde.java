package creator.factory.abstractFactory.factory;

import creator.factory.abstractFactory.factory.AbstractFactory;
import creator.factory.abstractFactory.factory.KeyboardFactory;
import creator.factory.abstractFactory.factory.MouseFactory;

public class FactoryFacde {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("mouse")){
            return new MouseFactory();
        }else  if(choice.equalsIgnoreCase("keyboard")){
            return new KeyboardFactory();
        }
        return null;
    }

}
