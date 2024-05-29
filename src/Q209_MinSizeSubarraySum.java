public class Q209_MinSizeSubarraySum {


    public static int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int ln = nums.length;

        int left = 0;
        int right = 0 ;

        while(right < ln){
            sum += nums[right];

            while(sum >= target){
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }


        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums= {7,1,6};

        System.out.println(minSubArrayLen(target,nums));

        System.out.println(Arrays.);

    }
}
