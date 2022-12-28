public class Singletonx {
//    private Singleton () {
//
//    }

    private static Singletonx instance;

    public static Singletonx getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singletonx();
        }

        return instance;
    }

}