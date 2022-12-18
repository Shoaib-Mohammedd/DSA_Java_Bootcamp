import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println( "  " );
        int number = input.nextInt();
        for (int num = 1; num < number; num++) {
            System.out.println( num + " ");
            System.out.println(" Hello World! ");

        }
    }
}
