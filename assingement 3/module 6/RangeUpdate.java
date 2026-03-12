public class RangeUpdate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int[] diff = new int[n + 1];

        int L = 1, R = 3, val = 5;
        diff[L] = diff[L] + val;
        diff[R + 1] = diff[R + 1] - val;

        int current = 0;
        for (int i = 0; i < n; i++) {
            current = current + diff[i];
            arr[i] = arr[i] + current;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
