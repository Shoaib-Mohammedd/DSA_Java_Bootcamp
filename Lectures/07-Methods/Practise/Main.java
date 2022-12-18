import java.util.Scanner;

// find largest and smallest numbers
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " find largest and smallest of three numbers! " );

        System.out.println( " Please enter first number! : " );
        int firstNumber = scanner.nextInt();

        System.out.println( " Please enter second number! : " );
        int secondNumber = scanner.nextInt();

        System.out.println( " Please enter third number! : " );
        int thirdNumber = scanner.nextInt();

        int largest  = largest ( firstNumber , secondNumber , thirdNumber );
        int smallest = smallest (firstNumber , secondNumber , thirdNumber );
        System.out.printf( " The largest number is %d, %d, and %d is : %d %n", firstNumber ,  secondNumber , thirdNumber , largest);
        System.out.printf(" The Smallest number is %d, %d, and %d is : %d %n", firstNumber , secondNumber , thirdNumber , smallest);

    }
    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}