class A {
    void run() { System.out.println("A"); }
}

class B extends A {
    void run() { System.out.println("B"); } 
    void run(int x) { System.out.println(x); } 
}

public class Compare {
    public static void main(String[] args) {
        B obj = new B();
        obj.run();
        obj.run(10);
    }
}
