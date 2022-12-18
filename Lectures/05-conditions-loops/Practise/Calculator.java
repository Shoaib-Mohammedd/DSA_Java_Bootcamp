//import java.util.Scanner;
//public class Calculator {
//    public static void main(String[] args) {
//        Scanner input = new Scanner( System.in );
//        int ans = 0;
//        while (true){
//            System.out.println(" Enter the operation");
//            char op = input.next().trim().charAt(0);
//            System.out.println();
//            if ( op == " +" || op == "*" || op == "-" || op == "%"){
//                System.out.println(" Enter Two numbers ");
//                int number = input.nextInt();
//                int number2 = input.nextInt();
//                System.out.println();
//                if ( op == " +"){
//                    ans  = number + number2;
//                }
//                if ( op == "-"){
//                    ans =number - number2;
//                }
//                if ( op == "*"){
//                    ans =number * number2;
//                }
//                if ( op == " /"){
//                    ans =number / number2;
//                }
//                if ( op == "%"){
//                    ans = number % number2;
//
//                }
//            } else if (op == "x"|| op == "X"){
//                break;
//            } else {
//                System.out.println( " Invalid Operation");
//            }
//        }
//    }
//}
