import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Mainin {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];
        Student shoaib = new Student(15, "shoaib Mohammed ", 85.4f);
        Student rahul = new Student(18, "Idman Abdirahman", 90.3f);
        System.out.println(shoaib.rno);
        System.out.println(shoaib.name);
        System.out.println(shoaib.marks);
        Student random = new Student(shoaib);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);

    }
}
class Student {
    int rno;
    String name;
    float marks = 90;

    void greeting() {
        System.out.println(" Hello! My name is " + this.name);
    }
    void changeName(String name) {
        this.name = name;
    }
    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student () {

        this (13, "default person", 100.0f);
    }
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}