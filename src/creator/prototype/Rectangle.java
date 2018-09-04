package creator.prototype;

public class Rectangle extends  Shape {

    @Override
    public void draw() {
        System.out.println("running..........." + this.getClass().getName()+"........draw");
    }

    public Rectangle() {
        type = "Rectangle";
    }
}
