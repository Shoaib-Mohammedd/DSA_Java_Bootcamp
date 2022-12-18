import java.util.Arrays;

public class ArraysPassingInFunction {
    public static void main(String[] args) {

        int [ ] num = {32,234,324,124,421};
        System.out.println((Arrays.toString(num)));
        change(num) ;
    }
    static  void change ( int [ ] arr){
        arr [0] = 44;
    }
}
