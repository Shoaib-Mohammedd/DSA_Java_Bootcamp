import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int EmpId = input.nextInt();
        String Department = input.nextLine();
        switch ( EmpId){
            case 1 :
                System.out.println(" Shoaib Mohammed");
                break;
            case 2 :
                System.out.println(" Idman Abdirahman");
                break;
            case 3:
                System.out.println(" Emp Num 3");
                switch ( Department){
                    case "IT":
                        System.out.println(" Information R=Technology Department !");
                        break;
                    case " HR":
                        System.out.println(" Human Resources Department !");
                        break;
                    case "Mgt":
                        System.out.println(" Management Department !");
                        break;
                    default:
                        System.out.println(" No department entered");

                }
            default:
                System.out.println(" Enter a correct EmpId");
        }
    }
}
