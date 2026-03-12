public class Quick {
    static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }
    
    static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            sort(arr, l, pi - 1);
            sort(arr, pi + 1, h);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
