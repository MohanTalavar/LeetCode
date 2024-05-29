
import java.util.Arrays;
import java.util.Collections;

public class LargetsPositiveInteger_2441 {

    public static int findMax(int[] nums) {


        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == -nums[j]) {
                    return Math.abs(nums[i]);
                }
            }
        }

        return 0;

    }

    public static void main(String[] args) {

        int[] arr = {33, 44, 11, 99, 100, -33};
        System.out.println(findMax(arr));
    }
}
