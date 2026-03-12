public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max_sum = arr[0];
        int current_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            current_sum = current_sum + arr[i];
            if (current_sum > max_sum) {
                max_sum = current_sum;
            }
            if (current_sum < 0) {
                current_sum = 0;
            }
        }
        System.out.println("Maximum subarray sum is: " + max_sum);
    }
}
