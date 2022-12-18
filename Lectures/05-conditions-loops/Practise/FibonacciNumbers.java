import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a fibonacci number to see it's previous ");
        int number = input.nextInt();
        int a = 0;
        int b = 1;
        int counter = 2;
        while ( counter <= number){
            int tempt = b;
            b = b + a;
            a = tempt;
            counter++;
        }
        System.out.println( b);
    }
}
