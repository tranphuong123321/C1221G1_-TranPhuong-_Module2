package bai06.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed =0.0f;

    public MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float speed){
        this.xSpeed = speed;
        this.ySpeed = speed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint" +
                "xSpeed=" +xSpeed +
                ", ySpeed=" +ySpeed +
                ",point position:  "+super.toString();
    }

    public MovablePoint move(){
         setX(getX()+getXSpeed());
         setY(getY()+getYSpeed());
         return this;
    }
}
