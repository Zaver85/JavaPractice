//1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
//использовать не все придуманные поля и методы. Создайте несколько
//экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//его кличка, цвет и возраст (или другие параметры на ваше усмотрение).



public class Task27 {
    public static void main(String[] args) {
        Task27_1_Cat cat1 = new Task27_1_Cat("Васька", 2011, "Черный", "Иван Иванов");
        Task27_1_Cat cat2 = new Task27_1_Cat("Мурзик", 2020, "Белый", "Петр Петров");
        Task27_1_Cat cat3 = new Task27_1_Cat("Беляш", 2015, "Трехцветный", "Сидр Сидоров");

        System.out.println(cat1 + System.lineSeparator());
        System.out.println(cat2 + System.lineSeparator());
        System.out.println(cat3 + System.lineSeparator());

    }
}
