import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        int [][] arr = new int[3][];
        int [][] arr2D = {
                { 123,2414,41,},    //   oth index  -> arr2D
                {14,415,4,34,6},   //   1st index   -> arr2D
                {346,347,723,2}   // 2nd index -> arr2D [] = ( 346,347,723,2 )


        };
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr.length);
        int [] [] ar = {
                { 23, 2, 25},
                { 32,  237},
                { 23, 10,23}
        };
        System.out.println(Arrays.toString(ar));
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {

            }
            System.out.println();

        }


        for ( int rows = 0; rows < arr.length; rows++){
            System.out.println(Arrays.toString(arr[rows]));
        }

    }
}
