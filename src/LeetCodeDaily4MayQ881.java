import java.util.Arrays;

public class LeetCodeDaily4MayQ881 {

    public static int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int p1 = 0;
        int p2 = people.length-1;
        int count = 0;

        while(p1 <= p2){
            if(people[p1] + people[p2] <= limit){
                p1++;
            }
            p2--;
            count++;
        }

        return count;

    }
    public static void main(String[] args) {

        int[] people = {2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10};
        int limit = 50;
        System.out.println(numRescueBoats(people, limit));

    }
}
