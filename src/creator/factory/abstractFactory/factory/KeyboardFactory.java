package creator.factory.abstractFactory.factory;

import creator.factory.abstractFactory.Keyboard;
import creator.factory.abstractFactory.Mouse;
import creator.factory.abstractFactory.impl.DellKeyboard;
import creator.factory.abstractFactory.impl.HPKeyboard;


public class KeyboardFactory extends AbstractFactory{

    @Override
    public Keyboard createKeyboard(String keyboardType) {
        if(keyboardType == null){
            return null;
        }
        if(keyboardType.equalsIgnoreCase("dell")){
            return  new DellKeyboard();
        }else if (keyboardType.equalsIgnoreCase("hp")){
            return  new HPKeyboard();
        }
        return  null;
    }

    @Override
    public Mouse createMouse(String mouseType) {
        return null;
    }
}
