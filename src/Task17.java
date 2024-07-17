//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная
//была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (true) {
            System.out.println("Введите текст для сохранения в памяти ");
            System.out.println("Введите \"print\" для вывода списко в обратном порядке ");
            System.out.println("Введите \"revert\" для удаления предыдущего текста ");
            System.out.println("Введите \"q\" для выхода из программы ");

            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("До встречи!");
                break;
            }

            if (input.equals("print")) {
                if (list.isEmpty()) {
                    System.err.println("В память не добавлен текст");
                } else {
                    for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.print(list.get(i) + " ");
                    }
                    System.out.println();
                }
            } else if (input.equals("revert")) {
                ((LinkedList<String>) list).removeLast();
                System.out.println(list);
            } else {
                list.add(input);
                System.out.println(list);

            }

        }
        scanner.close();

    }
}
