import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int m = s.nextInt();
        
        switch (m / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
