import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Shoaib Mohammed Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Shoaib   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}