import java.util.ArrayList;
import java.util.Collections;

public class SubClassx extends A {

    public SubClassx(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Idman Abdurahman");
//        int n = obj.num;
    }
}

class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Idman Abdurahman");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Idman Abdurahman");
//        int n = obj.num;
    }
}