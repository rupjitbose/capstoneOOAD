package org.example;



import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Student {
    private String name;
    private int marks;


    public Student(String name,int marks){
        this.marks=marks;
        this.name=name;
    }

    public Student(int marks){
        this.marks=marks;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

   public static void main(String[] a){

       Comparator<Student> studentComparator = // Custom Comparator to verify student marks
               new Comparator<Student>() {
                   @Override
                   public int compare(Student firstStudent, Student secondStudent) {
                       return (firstStudent.marks>secondStudent.marks)? firstStudent.marks: secondStudent.marks;
                   }
               };
       TreeSet<Student> studentsMarks = new TreeSet<>(studentComparator);

       studentsMarks.add(new Student("rup1",67));
       studentsMarks.add(new Student("rup2",76));
       studentsMarks.add(new Student("rup3",37));
       studentsMarks.add(new Student("rup4",50));
       studentsMarks.add(new Student("rup5",49));

       SortedSet<Student> name1 = studentsMarks.tailSet(new Student(35)); // Use tailSet to find all students with marks 35 or above. A sorted set by marks.
       name1.forEach(System.out::println);

   }


}
