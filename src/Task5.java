//Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая
//состоит из чередующихся символов c1 и c2, начиная с c1.



public class Task5 {
    public static void main(String[] args) {
        int n = 8;
        char c1 = 'A';
        char c2 = 'B';
        // Должно получиться: ABABABAB
        System.out.println(alternatingCharSb(n, c1, c2));
    }

//1 решение
    public static String alternatingCharStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str = str + c1 + c2;
        }
        return str;
    }

//2 решение
    public static String alternatingCharSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}
