class Shape {
    void draw() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
