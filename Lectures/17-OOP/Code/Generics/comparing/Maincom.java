import java.util.Arrays;
import java.util.Comparator;

public class Maincom {
    public static void main(String[] args) {
        Student kunal = new Student();
        Student rahul = new Student();
        Student arpit = new Student();
        Student karan = new Student();
        Student sachin = new Student();

        Student[] list = {kunal, rahul, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks - o2.marks);
            }
        });

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

//        if (kunal.compareTo(rahul) < 0) {
//            System.out.println(kunal.compareTo(rahul));
//            System.out.println("Rahul has more marks");
//        }

    }
}