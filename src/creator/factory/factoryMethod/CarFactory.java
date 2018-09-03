package creator.factory.factoryMethod;

/**
 * Created by huanghl on 2018/9/1.
 */
public class CarFactory {

    static Car create(String brand){
        if(brand.equals("bmw")){
            return new BMW();
        }else
            return new Bens();
    }

}
