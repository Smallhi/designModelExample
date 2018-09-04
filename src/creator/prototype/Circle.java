package creator.prototype;

public class Circle extends  Shape {

    @Override
    public void draw() {
        System.out.println("running..........." + this.getClass().getName()+"........draw");
    }

    public Circle() {
        type = "Circle";
    }
}
