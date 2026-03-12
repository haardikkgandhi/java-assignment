public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = new int[arr.length];
        
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int left = 1;
        int right = 3;
        int sum = 0;

        if (left == 0) {
            sum = prefix[right];
        } else {
            sum = prefix[right] - prefix[left - 1];
        }

        System.out.println("Sum of range [1, 3] is: " + sum);
    }
}
