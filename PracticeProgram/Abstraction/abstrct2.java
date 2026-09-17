
abstract class Shape {

    abstract void area();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class abstrct2 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}