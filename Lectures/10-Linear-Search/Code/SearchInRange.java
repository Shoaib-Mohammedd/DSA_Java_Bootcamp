import java.util.Arrays;
public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = { +2, 52, 061, 5, -43, 11, 44};
        char target = 11;
        System.out.println( search (String.valueOf(arr), target, 0,3));

    }
    static boolean search ( String str, char target, int start, int end){
        if ( str.length() == 0){
            return false;
        }
        for (int i = start; i <=end; i++) {
            if ( target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
