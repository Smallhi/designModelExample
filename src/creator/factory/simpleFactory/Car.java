package creator.factory.simpleFactory;

/**
 * Created by huanghl on 2018/9/1.
 */
public class Car {

    private  String wheels;
    private  String base;
    private  String engine;
    private  String gear;
    private  String appearacne;

    public Car(String wheels, String base, String engine, String gear, String appearacne) {
        this.wheels = wheels;
        this.base = base;
        this.engine = engine;
        this.gear = gear;
        this.appearacne = appearacne;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public void setAppearacne(String appearacne) {
        this.appearacne = appearacne;
    }

    public void showCar(){
        System.out.println("wheels is " + this.wheels);
        System.out.println("base is " + this.base);
        System.out.println("engine is " + this.engine);
        System.out.println("gear is " + this.gear);
    }
}
