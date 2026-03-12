public class Missing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        
        int total_sum = n * (n + 1) / 2;
        int current_sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            current_sum = current_sum + arr[i];
        }
        
        int missing = total_sum - current_sum;
        System.out.println("Missing number is: " + missing);
    }
}
