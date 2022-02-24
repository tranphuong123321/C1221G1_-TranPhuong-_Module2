package bai_7.thuc_hanh.trien_khai_interface_comparator;

public class Circle extends Shape {
    private double radius = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
}
