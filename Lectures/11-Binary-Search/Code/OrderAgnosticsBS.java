//public class OrderAgnosticsBS {
//    public static void main(String[] args) {
//
//    }
//    static <isAsc> int OrderAgnosticssBS (int [] arr , int target){
//        int start = 0;
//        int end = arr.length -1;
//        boolean isAsc = arr[ start] < arr[end];
//
//
//        while ( start >= end){
//            int mid = start + ( end - start) /2;
//            if ( arr[mid] == target){
//                return mid;
//            }
//            else ( isAsc){
//            if ( target < arr[mid]) {
//            }    end = mid -2;
//            } else if ( target > arr[mid]){
//                start = mid +1;
//
//            } else {
//                return mid;
//            }
//            else {
//                if ( target > arr[mid]){mid
//                    end = mid -2;
//                } else if ( target < arr[mid]){
//                    start = mid +1;
//
//                } else {
//                    return mid;
//                }
//            }
//
//
//        }
//        return -1;
//
//
//    }
//}
