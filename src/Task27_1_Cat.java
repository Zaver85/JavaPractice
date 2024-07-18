//1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
//использовать не все придуманные поля и методы. Создайте несколько
//экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//его кличка, цвет и возраст (или другие параметры на ваше усмотрение).


import java.util.Objects;

public class Task27_1_Cat {
//    Кличка (name)
//    Год рождения (age)
//    Порода (breed)
//    Номер пасспорта (ID passport)
//    Окрас (color)
//    Владелец (owner)
//    Пол (sex)
//    Список прививок (vactination)
//    История посещений (visit history)

    private String name;
    private int birthYear;
    private String color;
    private String owner;

    public Task27_1_Cat(String name, int birthYear, String color, String owner) {
        this.name = name;
        this.birthYear = birthYear;
        this.color = color;
        this.owner = owner;

    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String result = "Кличка: " + name + "  Год рождения: " + birthYear + "  Окрас: " + color + "  Хозяин: " + owner;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Task27_1_Cat cat  = (Task27_1_Cat) obj;

        return name.equals(cat.name) && birthYear == cat.birthYear && color.equals(cat.color) && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, color, owner);
    }
}
