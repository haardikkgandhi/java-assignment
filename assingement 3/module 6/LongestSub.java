public class LongestSub {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int target = 3;
        int max_len = 0;

        for (int i = 0; i < arr.length; i++) {
            int current_sum = 0;
            for (int j = i; j < arr.length; j++) {
                current_sum = current_sum + arr[j];
                if (current_sum == target) {
                    int len = j - i + 1;
                    if (len > max_len) {
                        max_len = len;
                    }
                }
            }
        }
        System.out.println("Longest subarray length is: " + max_len);
    }
}
