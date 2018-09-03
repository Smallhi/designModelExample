package creator.factory.factoryMethod;

/**
 * Created by huanghl on 2018/9/1.
 */
public class BMW implements Car {

    @Override
    public void showCar() {
        System.out.println("show BMW........");
    }

    @Override
    public void designCar() {
        System.out.println("design BMW........");
    }

    @Override
    public void produceCar() {
        System.out.println("producer BMW........");
    }

    public void driveBmw(){
        System.out.println("driver BMW........");
    }
}
