package oop;

public class CallingTriangleClass {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.setSide1(3);
        triangle1.setSide2(5);
        triangle1.setSide3(4);

        System.out.println(triangle1.areaTriangle());
    }
}
