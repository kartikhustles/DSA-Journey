import java.util.*;

public class OOPS_intro {
    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student(200, "Rahul Kumar", 99.9f);

        student1.rno = 13;
        student1.name = "Kartik Agarwal";
        student1.marks = 88.9f;

        System.out.println(student1.marks);

        // student1.greeting();

        student1.changeName("Shalini Thakur");

        // student1.greeting();



        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);


        // System.out.println(student2.rno);
        // System.out.println(student2.name);
        // System.out.println(student2.marks);

        Student random = new Student(student1);

        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks;


    void greeting(){
        System.out.println("Hello! My Name is " +this.name+ " !");
    }


    void changeName(String newName){
        name = newName;
    }


    Student(){
        this.rno = 13;
        this.name = "Kartik";
        this.marks = 99.9f;
    }


    // Student(int roll, String naam, float mark){
    //     rno = roll;
    //     name = naam;
    //     marks = mark;
    // }

    // More Modified

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }


    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}