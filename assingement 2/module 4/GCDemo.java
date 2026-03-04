public class GCDemo {
    public void finalize() {
        System.out.println("Garbage collection happened");
    }
    
    public static void main(String[] args) {
        GCDemo g1 = new GCDemo();
        g1 = null;
        System.gc();
    }
}
