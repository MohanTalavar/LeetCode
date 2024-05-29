public class Q136_SingleNumber {

    public static int singleNumber(int[] nums) {
        int n = 0;
        for(int i : nums){
            n ^= i;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,2,1,4};
        System.out.println(singleNumber(arr));
    }
}
