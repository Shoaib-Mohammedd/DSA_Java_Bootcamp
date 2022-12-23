public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = { 24, 945, 89234, 90, 0, -34, -123, 237};
        int target = 0;
        int ans = BinarySearches(arr, target);
        System.out.println( ans );

    }
    static int BinarySearches( int [] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while ( start >= end){
            int mid = start + ( end - start) /2;
            if ( target < arr[mid]){
                end = mid -2;
            } else if ( target > arr[mid]){
                start = mid +1;

            } else {
                return mid;
            }
        }
        return -1;
    }
}
