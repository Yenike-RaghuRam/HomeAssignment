package Set4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int rollno;
    String name;

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollno - o.rollno;
    }
}

class Student2 {
    int rollno;
    String name;

    public Student2(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

}

public class SortStudentObject {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Hi");
        Student s2 = new Student(1, "Bye");
        Student s3 = new Student(3, "Hmmm");

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Collections.sort(al);
        for(Student val: al){
            System.out.println(val.rollno);
        }

        Comparator<Student2> cmps= Comparator.comparingInt(o1 -> o1.rollno);


//        Comparator<Student2> cmps= (o1, o2) -> o1.rollno - o2.rollno;


//        Comparator<Student2> cmps= new Comparator<Student2>(){
//
//            public int compare(Student2 o1, Student2 o2) {
//                return o1.rollno - o2.rollno;
//            }
//
//        };

        Student2 st1 = new Student2(10, "Hi");
        Student2 st2 = new Student2(1, "Bye");
        Student2 st3 = new Student2(3, "Hmmm");

        ArrayList<Student2> al2 = new ArrayList<>();
        al2.add(st1);
        al2.add(st2);
        al2.add(st3);

//        al2.sort(cmps);
        Collections.sort(al2, cmps);

        for(Student2 val: al2){
            System.out.println(val.rollno);
        }


    }
}
