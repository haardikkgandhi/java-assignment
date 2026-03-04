final class FinalClass {
    void show() {
        System.out.println("This is a final class");
    }
}

class SuperClass {
    final void display() {
        System.out.println("This is a final method");
    }
}

public class FinalDemo extends SuperClass {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println("Final variable x: " + x);
        
        FinalDemo obj = new FinalDemo();
        obj.display();
        
        FinalClass fc = new FinalClass();
        fc.show();
    }
}
