//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//Сравните с предыдущим.


// ??? Возможно не верное решение!!!

import java.util.LinkedList;
import java.util.ArrayList;

public class Task15 {
    public static void main(String[] args) {
        int size = 10_000;

        System.out.println(" Добавление в конец списка: ");
        System.out.println("ArrayList: ");
        long start = System.currentTimeMillis();
        getArrayListAddLast (size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList: ");
        start = System.currentTimeMillis();
        getLinkedListAddLast (size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println(" Добавление в начало списка: ");
        System.out.println("ArrayList: ");
        start = System.currentTimeMillis();
        getArrayListAddFirst (size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList: ");
        start = System.currentTimeMillis();
        getLinkedListAddFirst (size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println(" Добавление в середину списка: ");
        System.out.println("ArrayList: ");
        start = System.currentTimeMillis();
        getArrayListAddMiddle (size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList: ");
        start = System.currentTimeMillis();
        getLinkedListAddMiddle (size);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static LinkedList<Integer> getLinkedListAddLast (int size) {
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            LinkedList.addLast(i);
        }
        return  LinkedList;
    }

    public static ArrayList<Integer> getArrayListAddLast (int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size(), i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddFirst (int size) {
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            LinkedList.addFirst(i);
        }
        return  LinkedList;
    }

    public static ArrayList<Integer> getArrayListAddFirst (int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddMiddle (int size) {
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            LinkedList.add(LinkedList.size() / 2, i);
        }
        return LinkedList;
    }

    public static ArrayList<Integer> getArrayListAddMiddle (int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        return arrayList;
    }
}
