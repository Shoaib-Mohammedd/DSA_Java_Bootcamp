import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                { 32, 32,45, 35,78, 7, 6},
                {18, 12, 9, 3,},
                {79, 99, 56, 48},
                {28, 73, 86, 418}


        };
        int target = 18;
        int[] ans = search(arr, target);
        //System.out.println(search(target));

        System.out.println(Arrays.toString(ans));
        //int target = 18;

    }
    static int[] search(int [][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col< arr[col].length; col++){
                if ( arr[row][col] == target)
                    return new int [] { row, col};
            }

        }

        return new int [] { -1, -1};
    }
}
