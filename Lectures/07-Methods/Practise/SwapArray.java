public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {23, 14, 64, 57, 346,};

        swap(arr, 0, 2);
    }

    static void swap(int[] arr, int index1, int index2) {
        int tempt = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tempt;
    }
}