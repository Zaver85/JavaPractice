//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на
//экран.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        int count = 10;
        fillRandomList(randomList, count, 1,100);

        System.out.println("Неотсортированый список: " + randomList);

        Collections.sort(randomList);
        System.out.println("После сортировки: " + randomList);
    }

    private static void fillRandomList(ArrayList<Integer> randomList, int count, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            randomList.add(rnd.nextInt(min, max));
        }
    }
}
