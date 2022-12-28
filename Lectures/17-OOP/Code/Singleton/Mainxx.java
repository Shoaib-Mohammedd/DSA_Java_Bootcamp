public class Mainxx {
    public static void main(String[] args) {
        Singletonx obj1 = Singletonx.getInstance();

        Singletonx obj2 = Singletonx.getInstance();

        Singletonx obj3 = Singletonx.getInstance();

        // all 3 ref variables are pointing to just one object

        A a = new A(10, "Idman");
        a.getNum();
//        int n = a.num;
    }
}