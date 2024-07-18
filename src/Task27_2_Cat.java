import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task27_2_Cat {
    public static void main(String[] args) {
        Task27_1_Cat cat1 = new Task27_1_Cat("Васька", 2011, "Черный", "Иван Иванов");
        Task27_1_Cat cat2 = new Task27_1_Cat("Мурзик", 2020, "Белый", "Петр Петров");
        Task27_1_Cat cat3 = new Task27_1_Cat("Беляш", 2015, "Трехцветный", "Сидр Сидоров");

        Set<Task27_1_Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3));

        for (Task27_1_Cat cat : cats) {
            System.out.println(cat);
        }

    }
}