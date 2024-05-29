import java.util.*;


public class RelativeRanks_Q506 {

    public static String[] findRelativeRanks(int[] score) {



        Integer[] scoreCopy = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreCopy, Collections.reverseOrder());

        String[] answer = new String[score.length];

        Map<Integer, String> map = new HashMap<>();
//        int i = 0;
//        map.put(scoreCopy[i++], "Gold Medal");
//        map.put(scoreCopy[i++], "Silver Medal");
//        map.put(scoreCopy[i++], "Bronze Medal");

        for (int i = 0; i < score.length; i++) {
            if (i == 0) {
                map.put(scoreCopy[i], "Gold Medal");
            }else if (i == 1) {
                map.put(scoreCopy[i], "Siver Medal");
            }else if (i == 2) {
                map.put(scoreCopy[i], "Bronze Medal");
            }else{
                map.put(scoreCopy[i], i +1 + "");
            }

        }


        for (int j = 0; j < score.length; j++) {

            answer[j] = map.get(score[j]);

        }

        System.out.println(map);

        return answer;

    }

    public static void main(String[] args) {

        int[] arr = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }
}
