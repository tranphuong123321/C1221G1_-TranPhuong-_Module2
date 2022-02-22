package bai04.bai_tap.xay_dung_fan;

public class Fan {
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
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
        if (this.isOn()) {
            return "Fan is on," +
                    " speed=" + this.getSpeed() +
                    ", radius=" + this.getRadius() +
                    ", color=" + this.getColor() +
                    '\n';
        } else {
            return "Fan is off, speed = " + this.getSpeed() +
                    " , radius= " + this.getRadius() +
                    " , color = " + this.getColor() +
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
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
