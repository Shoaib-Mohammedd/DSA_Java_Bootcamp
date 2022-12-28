public class Basicen {
    enum Week implements Aen    {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;


        void display() {

        }

        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

    }
}