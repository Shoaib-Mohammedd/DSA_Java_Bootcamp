import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Last Line
        Names("Empty" , "you" ,"mom" ," Abdirahman" ,"Nafisa");
        Scanner input = new Scanner( System.in);
        int [] arr = new int[8];
        arr [0] = 25261;
        arr [1] = 5;
        arr [2] = 43;
        arr [3] = 11;
        arr [4] = 44;
        System.out.println( arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            // System.out.println( Arrays.toString(arr));   prints something ;like this >[ ]
            System.out.println(arr[i]);
            System.out.println( i);

            for ( int num : arr){ // for every element in arr prints the element
                System.out.println( num + " "); // num represents element in arr


            }

        }

    }

    private static void Names(String empty, String you, String idman, String s, String hafisa) {
    }

    static String Names (String arr[ ]){
        arr = new  String[4];

        return null;
    }
}
