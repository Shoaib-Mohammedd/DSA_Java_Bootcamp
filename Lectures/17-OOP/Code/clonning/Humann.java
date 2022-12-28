public class Humann implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Humann(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }



    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone();
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}