package creator.factory.abstractFactory.impl;

import creator.factory.abstractFactory.Keyboard;

public class DellKeyboard implements Keyboard{

    @Override
    public void showComponent() {
        System.out.println("this is DellKeyboard...in "+ this.getClass().getName());
    }
}
