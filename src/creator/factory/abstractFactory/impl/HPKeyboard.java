package creator.factory.abstractFactory.impl;

import creator.factory.abstractFactory.Keyboard;

public class HPKeyboard implements Keyboard{

    @Override
    public void showComponent() {
        System.out.println("this is HPKeyboard...in "+ this.getClass().getName());
    }
}
