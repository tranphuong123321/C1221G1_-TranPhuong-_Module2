package bai07.bai_tap.trien_khai_resizeable;

public class Square extends Shape implements Resizeable{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){

    }
    public Square(double side){
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side *= percent;
    }
}
