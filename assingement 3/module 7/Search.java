public class Search {
    static int iterativeSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static int recursiveSearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return recursiveSearch(arr, target, mid + 1, high);
        return recursiveSearch(arr, target, low, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;
        System.out.println("Iterative index: " + iterativeSearch(arr, target));
        System.out.println("Recursive index: " + recursiveSearch(arr, target, 0, arr.length - 1));
    }
}
