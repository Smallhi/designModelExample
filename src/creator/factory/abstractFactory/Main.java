package creator.factory.abstractFactory;

import creator.factory.abstractFactory.factory.AbstractFactory;
import creator.factory.abstractFactory.factory.FactoryFacde;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryFacde.getFactory("mouse");
        // 因为是接口的类型，只能调用接口的方法，但实际调用的是对象的方法
        Mouse mouse = factory.createMouse("dell");
        mouse.showComponent();


        //
        AbstractFactory factory1 = FactoryFacde.getFactory("keyboard");
        Keyboard keyboard = factory1.createKeyboard("hp");
        keyboard.showComponent();

        // 抽象工厂的一个问题的优势是解决了在工厂里创建具有组合关系的组件的初始化问题，但另一个问题，一旦有新的组件加入，就需要
        //1. 改造工厂
        //2. 实现组件对应的工厂类

    }
}
