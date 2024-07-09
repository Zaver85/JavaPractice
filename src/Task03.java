//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести
//эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива
//должны быть отличны от заданного, а остальные - равны ему.


import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int leftIdx = 0;
        int rightIdx = nums.length - 1;

        while (leftIdx < rightIdx){
            while (nums[rightIdx] == val && leftIdx < rightIdx){
                rightIdx--;
            }
            if (nums[leftIdx] == val){
                nums[leftIdx] = nums[rightIdx];
                nums[rightIdx] = val;

            }
            leftIdx++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
