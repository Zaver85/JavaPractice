//Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает
//boolean значение).



public class Task07 {
    public static void main(String[] args) {
        String word = "арозаупаланалапуазора";
        System.out.println(isPalindrom(word));
    }


    static boolean isPalindrom(String inputStr) {
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - 1 - i))
                return false;
        }

        return true;

    }
}
