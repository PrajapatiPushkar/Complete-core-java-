package src.CollectionsFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student s){
            return this.rollNo == s.rollNo && this.name.equals(s.name);
        }
        return false;
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // autoboxing ->
        list.add(7);
        list.add(9);
        list.add(1,5);
        list.set(1,6);
        list.addFirst(10);
        list.addLast(8);
        list.remove(3);
        list.remove(Integer.valueOf(8));
        System.out.println(list);

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "Rahul"));
        list1.add(new Student(2, "Aman"));
//        System.out.println(list1);

        list1.remove(new Student(2, "Aman"));
        ListIterator<Student> listIterator = list1.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("Reverse");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("Enhance for loop");
        for (Student s : list1){
            System.out.println(s);
        }

        System.out.println("Size: " + list.size());
        System.out.println("Size: " + list1.size());

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
