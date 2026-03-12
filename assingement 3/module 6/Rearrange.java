public class Rearrange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int[] result = new int[n];
        
        int even_pos = 0;
        int odd_pos = 1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if (even_pos < n) {
                    result[even_pos] = arr[i];
                    even_pos = even_pos + 2;
                }
            } else {
                if (odd_pos < n) {
                    result[odd_pos] = arr[i];
                    odd_pos = odd_pos + 2;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
