package org.example;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ArrayListSortingDemo {

    public static void main(String args[]) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        TreeSet<Integer> numbers= new TreeSet<Integer>();
        numbers.add(31);
        numbers.add(42);
        numbers.add(54);
        numbers.add(21);
        numbers.add(64);
        numbers.add(4);
        numbers.add(10);
        numbers.add(51);

        //System.out.println(students.get(0).getName());
        students.stream().filter(age->age.getAge()>8).forEach(s-> System.out.print(s.getName()+","));
        System.out.println();
        students.stream().filter(age->age.getClassNo()==6).forEach(s-> System.out.print(s.getName()+","));
        System.out.println();

        students.stream().sorted(Comparator.comparing(age->age.getAge())).forEach(s-> System.out.print(s.getName()+","));
        System.out.println();
        System.out.println(numbers);
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.headSet(21));
        System.out.println(numbers.tailSet(21));
        System.out.println(numbers.remove(54)); //true
        System.out.println(numbers.remove(20));
        System.out.println(numbers);
    }

    private static class Student {


        private String name;
        private int age;
        private int classNo;
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getClassNo() {
            return classNo;
        }



        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;



        }
    }
}