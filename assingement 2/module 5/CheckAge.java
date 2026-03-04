public class CheckAge {
    static void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Welcome side");
        }
    }
    
    public static void main(String[] args) {
        try {
            check(15);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
