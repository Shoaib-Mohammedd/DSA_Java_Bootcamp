public class main {
    public static void main(String[] args) {
        main funn = new main();
        funn.fun2();

    }
    static void fun() {
        main obj = new main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }
    void greeting() {
        System.out.println("Hello world");
    }
}