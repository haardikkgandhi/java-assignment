public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat(" World");
        System.out.println("String: " + s1);
        
        StringBuilder s2 = new StringBuilder("Hello");
        s2.append(" World");
        System.out.println("StringBuilder: " + s2);
        
        StringBuffer s3 = new StringBuffer("Hello");
        s3.append(" World");
        System.out.println("StringBuffer: " + s3);
    }
}
