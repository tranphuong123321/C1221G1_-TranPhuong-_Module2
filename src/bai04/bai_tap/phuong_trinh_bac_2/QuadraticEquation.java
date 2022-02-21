package bai04.bai_tap.phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public  QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(this.getB(),2)-4*this.getA()*this.getC();
    }
    public double getRoot1(){
        return (-this.getB()+this.getDiscriminant())/2*this.getA();
    }
    public double getRoot2(){
        return (-this.getB()-this.getDiscriminant())/2*this.getA();
    }
}

