public class overLoading {
    public static void main(String[] args) {
        fun(34);
        fun(" Idman Abdirahman");
    }

    static int fun(int a) {
        System.out.println(" First ine ");
        System.out.println(a);
        return a;
    }

    static int fun(String name) {
        System.out.println(" Second ine ");

        System.out.println(name);
        return 0;
    }
}