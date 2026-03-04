public class StringReverse {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + sb.toString());
    }
}
