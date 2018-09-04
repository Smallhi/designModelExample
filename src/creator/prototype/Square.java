package creator.prototype;

public class Square extends  Shape {

    @Override
    public void draw() {
        System.out.println("running..........." + this.getClass().getName()+"........draw");
    }

    public Square() {
        type = "Square";
    }
}
