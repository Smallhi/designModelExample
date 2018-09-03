package creator.factory.simpleFactory;

import creator.factory.simpleFactory.Car;
import creator.factory.simpleFactory.CarFactory;

public class Main {

    public static void main(String[] args) {

        // 简单工厂测试
        //CarFactory simpleCarfactory = new CarFactory();
        Car car = CarFactory.create();
        car.showCar();

        System.out.println("Hello World!");
    }
}
