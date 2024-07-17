//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
//и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
//некоторую букву во втором слове, при этом
//1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
//порядка следования. (Например, add - egg изоморфны)
//        2. буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true


import java.util.HashMap;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        System.out.println(isIsomorphicSee(word1, word2));
        scanner.close();

    }

    public static boolean isIsomorphicSee(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        if (word1.equals(word2)) {
            return true;
        }

        HashMap<Character, Character> hash = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            if (hash.containsKey(ch1) && ch2 != hash.get(ch1)) {
                return false;
            } else {
                hash.put(ch1, ch2);
            }
        }
        return true;

    }
}
