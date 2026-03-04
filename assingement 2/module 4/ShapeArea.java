abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        int r = 5;
        double a = 3.14 * r * r;
        System.out.println("Circle area is: " + a);
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 10;
        int b = 5;
        int a = l * b;
        System.out.println("Rectangle area is: " + a);
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        
        Rectangle r = new Rectangle();
        r.area();
    }
}
