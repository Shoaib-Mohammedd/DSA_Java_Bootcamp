public class Max {
    public static void main(String[] args) {
        int[] arr = {23, 14, 64, 57, 346,};
        System.out.println(MaxRange(arr,2,3));
    }
    static int MaxRange( int [] arr, int start, int end){
        int MaxValue =arr[0];
        for (int i = start; i <= end; i++) {
            if ( arr[0] > MaxValue){
                MaxValue = arr[0];
            }
        }
        return MaxValue;
    }

}