package creator.factory.abstractFactory.factory;

import creator.factory.abstractFactory.Keyboard;
import creator.factory.abstractFactory.Mouse;

public abstract class AbstractFactory {

    public abstract Mouse createMouse(String mouse);
    public abstract Keyboard createKeyboard(String keyboard);
}
