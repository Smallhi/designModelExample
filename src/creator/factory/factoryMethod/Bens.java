package creator.factory.factoryMethod;


/**
 * Created by huanghl on 2018/9/1.
 */
public class Bens implements Car {

    @Override
    public void showCar() {
        System.out.println("show Bens........");
    }

    @Override
    public void designCar() {
        System.out.println("design Bens........");
    }

    @Override
    public void produceCar() {
        System.out.println("produce Bens........");
    }

    public void dirveBens(){
        System.out.println("driver Bens........");
    }
}
