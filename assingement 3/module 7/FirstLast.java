public class FirstLast {
    static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return res;
    }

    static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int target = 2;
        System.out.println("First: " + findFirst(arr, target));
        System.out.println("Last: " + findLast(arr, target));
    }
}
