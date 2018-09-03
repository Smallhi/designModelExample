package creator.factory.abstractFactory.impl;

import creator.factory.abstractFactory.Mouse;

public class DellMouse implements Mouse{
    @Override
    public void showComponent() {
        System.out.println("This is DellMouse in " + this.getClass().getName());
    }


}
