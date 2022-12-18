import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 , number2, sum;
        System.out.print(" Enter number 1 !");
        number1 = input.nextInt();
        System.out.println(" Enter Number 2 !");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println(" Sum of numbers are " + sum);
    }
}
