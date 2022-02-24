package bai07.bai_tap.trien_khai_interface_colorable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("blue",true,4);
        Square square =  new Square("red",false,4);
        Rectangle rectangle = new Rectangle("Orange",true,9,8);
        Shape [] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;
        for(Shape i : shapes){
            System.out.println(i);
        }
    }
}
