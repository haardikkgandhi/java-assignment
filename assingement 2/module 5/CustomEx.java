class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class CustomEx {
    static void check(int n) throws MyException {
        if (n < 0) {
            throw new MyException("Number is negative");
        } else {
            System.out.println("Number is: " + n);
        }
    }
    
    public static void main(String[] args) {
        try {
            check(-5);
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
