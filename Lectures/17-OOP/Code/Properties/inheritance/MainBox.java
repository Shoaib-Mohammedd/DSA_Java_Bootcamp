public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.9);
        box1.getL();
        Box box2 = new Box(box1);

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting();
    }
}