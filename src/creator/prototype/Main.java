package creator.prototype;

public class Main {

    public static void main(String[] args) {
        // 将数据加载到缓存， hashtable
        ShapeCache.loadCache();

        //通过克隆的方式（原型模式）创建对象

        Shape cloneShape = (Shape) ShapeCache.getShape("1");

        System.out.println("Shape: " + cloneShape.getType());

    }
}
