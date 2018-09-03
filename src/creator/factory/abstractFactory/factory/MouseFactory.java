package creator.factory.abstractFactory.factory;

import creator.factory.abstractFactory.Keyboard;
import creator.factory.abstractFactory.Mouse;
import creator.factory.abstractFactory.impl.DellMouse;
import creator.factory.abstractFactory.impl.HPMouse;

public class MouseFactory extends AbstractFactory{

    @Override
    public Mouse createMouse(String mouseType) {
        if(mouseType == null){
            return null;
        }
        if(mouseType.equalsIgnoreCase("dell")){
            return  new DellMouse();
        }else if (mouseType.equalsIgnoreCase("hp")){
            return  new HPMouse();
        }
        return  null;
    }

    @Override
    public Keyboard createKeyboard(String keyboard) {
        return null;
    }
}
