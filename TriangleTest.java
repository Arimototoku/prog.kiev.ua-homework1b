package ua.i.sonne;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(10,10,10);
        Triangle triangleTwo = new Triangle(15,10,6);
        Triangle triangleThree = new Triangle(13,10,12);
        System.out.println("Площадь первого треугольника " + triangleOne.getSquare());
        System.out.println("Площадь второго треугольника " + triangleTwo.getSquare());
        System.out.println("Площадь третьего треугольника " + triangleThree.getSquare());
    }
}
