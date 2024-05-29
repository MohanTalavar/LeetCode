import java.util.HashMap;
import java.util.Map;

public class MajorityElem {

    public static int majorityElement(int[] nums) {

        int ln = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<ln; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        ln = ln/2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > ln) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,1,1,1,1};
        System.out.println(majorityElement(arr));


    }
}
