package bai06.bai_tap.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2DObj1 = new Point2D();
        Point2D point2DObj2 = new Point2D(3.1f,4.3f);
        System.out.println(point2DObj1);
        System.out.println(point2DObj2);
        Point3D point3DObj1 = new Point3D();
        Point3D point3DObj2 = new Point3D(point2DObj1.getX(),point2DObj2.getY(), 5.2f);
        System.out.println(point3DObj1);
        System.out.println(point3DObj2);
    }
}
