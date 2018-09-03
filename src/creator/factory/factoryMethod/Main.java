package creator.factory.factoryMethod;

/**
 * Created by huanghl on 2018/9/1.
 */
public class Main {

    public static void main(String[] args) {
        Car car =CarFactory.create("bmw");

        car.showCar();
        car.designCar();
        car.produceCar();
        // 只能访问到接口类型的属性,实际上是因为工厂的create 返回是create 类型，new的BWM和Bens被强制转换了
        ((BMW) car).driveBmw();
    }
}
