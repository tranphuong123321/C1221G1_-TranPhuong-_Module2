package bai06.bai_tap.lop_point_va_moveablepoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setXY(3,4);
        System.out.println(point1.toString());

        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setX(point1.getX());
        movablePoint.setY(point1.getY());
        System.out.println(movablePoint.toString());

        movablePoint.setSpeed(3);
        System.out.println(movablePoint.getXSpeed()+" " +movablePoint.getYSpeed());
        movablePoint.move();
        movablePoint.move();
        movablePoint.move();
        System.out.println(Arrays.toString(movablePoint.getXY()));
    }
}
