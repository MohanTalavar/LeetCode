public class CanJump {

    public static boolean canJump(int[] nums) {
        int maxReach = 0; // The farthest position you can reach
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // If you can reach this position, update maxReach
            if (i <= maxReach) {
                maxReach = Math.max(maxReach, i + nums[i]);
                // If you can reach or go beyond the last index, return true
                if (maxReach >= n - 1) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
