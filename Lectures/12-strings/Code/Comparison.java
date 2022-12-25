public class Comparison {
    public static void main(String[] args) {
        String a = "Shoaib";
        String b = "Shoaib";
        String c = a;

        String name1 = new String("Shoaib");
        String name2 = new String("Shoaib");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}