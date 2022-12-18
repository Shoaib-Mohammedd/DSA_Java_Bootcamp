import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String massage = greeting();
        System.out.println( massage);
        int ans = sum1(29,73);
        System.out.println( ans);
        Scanner inputName = new Scanner(System.in);
        System.out.println(" Enter you're name !");
        String name = inputName.next();
        String personalized = myGreet(name);
        System.out.println( personalized );
        int studentMarks = random(94);
        System.out.println( studentMarks);
        varArr(35,52,523,25,352,237);
    }
    static String greeting (){
        String greet = "How are you today ";
        return greet;
    }
    static int sum1 ( int a, int b){
        int sum = a + b;
        return sum;
    }
    static String myGreet ( String name){
        String massage = "Hello " + name;
        return massage;
    }
    static int random( int marks){
        int num = 93;
        System.out.println( num);
        System.out.println( marks);
        return num;
    }
    static int varArr ( int ...v){
        System.out.println(Arrays.toString(v));
        return varArr();
    }
 }

