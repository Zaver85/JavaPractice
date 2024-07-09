//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.




public class Task06 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        String newStr = compressString(str);
        System.out.println(newStr);

    }

    public static String compressString(String str) {
        int count = 1;
        StringBuilder result = new StringBuilder();
        char currentChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else  {
              result.append(currentChar).append(count);
              currentChar = str.charAt(i);
              count = 1;
            }
        }

        result.append(currentChar).append(count);

        return result.toString();
    }
}
