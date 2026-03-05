package src.CollectionsFramework.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(7);
        System.out.println(list);

        list.remove(1);
        list.remove(Integer.valueOf(7));
        list.addFirst(1);
        list.addLast(10);
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
