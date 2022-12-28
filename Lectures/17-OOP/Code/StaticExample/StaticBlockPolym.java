public class StaticBlockPolym {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlockPolym obj = new StaticBlockPolym();
        System.out.println(StaticBlockPolym.a + " " + StaticBlockPolym.b);

        StaticBlockPolym.b += 3;

        System.out.println(StaticBlockPolym.a + " " + StaticBlockPolym.b);

        StaticBlockPolym obj2 = new StaticBlockPolym();
        System.out.println(StaticBlockPolym.a + " " + StaticBlockPolym.b);
    }

}