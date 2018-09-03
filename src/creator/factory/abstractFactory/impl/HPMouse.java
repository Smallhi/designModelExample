package creator.factory.abstractFactory.impl;

import creator.factory.abstractFactory.Mouse;

public class HPMouse implements Mouse{
    @Override
    public void showComponent() {
        System.out.println("This is HPMouse in " + this.getClass().getName());
    }


}
