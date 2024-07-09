//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//максимальное количество подряд идущих 1.

public class Task02 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1,};
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
//Для запуска кода раскомментировать один из вариантов решения
//1 решенние
//                if (count > maxCount) {
//                    maxCount = count;
//                }
//2 решение
//                maxCount = count > maxCount ? count: maxCount;
//3 решение
                maxCount = Math.max(count, maxCount);
                } else {

                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}