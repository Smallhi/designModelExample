package creator.prototype;

import java.util.Hashtable;

public class ShapeCache {
    // 原型一般用在对性能要求比较高的场所，因为初始化对象代价比较大，如安全问题，性能问题，所以通过克隆方式获取对象

    // 如下实例，从数据库获取实体类，并把他们存储在一个Hashtable中。

    private  static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cacheShage = shapeMap.get(shapeId);
        // 通过克隆的方式返回一个对象，并且可以对这个对象进行重新设定，这种方式是浅拷贝，如果要深拷贝，需要序列化
        return (Shape) cacheShage.clone();
    }

   // 对每种形状的数据，都运行数据库查询，并创建形状,调用shapeMap.put方法，将其放入到缓存中
    // 后续要用的时候，调用get方法，从缓存中拷贝一份，就可使用
    // 由于数据库连接和访问时高延迟的，而数据对象的访问又是经常的，这样就能大大提高系统性能，

    public  static  void loadCache(){
        // 从数据库中取出对象，
        Circle circle = new Circle();
        circle.setId("1");
        // 放入到缓存中
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);

        // 在缓存中就包含着用户要访问的对象，通过clone 即可拿到这个对象

    }


}
