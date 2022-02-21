package bai04.bai_tap.xay_dung_fan;

public class Fan {
    private final String[] SPEED_NAME = {"LOW","MEDIUM","FAST"};
    private final int[] SPEED_LEVEL = {1,2,3};
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed = SPEED_LEVEL[0];
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.isOn()){
            return "Fan is on," +
                    " speed=" + SPEED_NAME[this.getSpeed()-1] +
                    ", radius=" + this.getRadius() +
                    ", color=" + this.getColor()  +
                    '\n';
        }else{
            return "Fan is off, speed = "+ SPEED_NAME[this.getSpeed()-1] +
                    " , radius= "+this.getRadius()+
                    " , color = "+this.getColor()+
                    "\n";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(2);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan2.setSpeed(1);
        System.out.println("fan1"+fan1.toString());
        System.out.println("fan2"+fan2.toString());
    }
}
