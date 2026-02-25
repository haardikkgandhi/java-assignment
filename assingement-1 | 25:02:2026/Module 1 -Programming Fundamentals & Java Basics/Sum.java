public class Sum {
    public static void main(String[] args) {
        int s = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                s = s + i;
            }
            i++;
        }
        System.out.println(s);
    }
}
