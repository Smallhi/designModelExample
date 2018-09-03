package creator.factory.simpleFactory;

/**
 * Created by huanghl on 2018/9/1.
 */
public class CarFactory {
    public static Car create(){
        return new Car("米其林","高端双悬挂底盘","ford2.0T","8速手自一体","水晶黑");
    }
}
