//Настроить проект, вывести в консоль "Hello? world!".
//Вывести в консоль системную дату и время

import java.time.LocalDateTime;

public class Seminar1 {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println(LocalDateTime.now());

        int y = 235689; //Integer
        double d = 236.56;  //Double
        String s = "Привет!";  //String
        char c = 't';  //char
        boolean b = true;  //boolean

        String[] str = new String[]{"ere","345", "651654"};
        String[] str1 = new String[]{"ere","345", "651654"};

        int nums[] = {5, 7, 9};

        if(5 > 4){

        }

//        while (d) {
//
//        }

        for (int i = 0; i < nums.length; i++);{

        }

        for (int elem : nums) {
            System.out.print(elem + "");
        }
        System.out.println(name("Алексей"));
    }

    public static String name(String name) {
        return " Привет! " + name + "!";
    }
}
