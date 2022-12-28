public interface Axt {
    static void greeting() {
        System.out.println("Hey I am static method");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}