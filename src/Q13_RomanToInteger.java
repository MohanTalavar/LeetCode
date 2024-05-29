import java.util.*;

public class Q13_RomanToInteger {
    public static int romanToInt(String s) {

        Map<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        List<Integer> list = new ArrayList<>();

        char[] cArr = s.toCharArray();

        for(char c : cArr){
            list.add(map.get(c));
        }

        //System.out.println(list);
        int sum = list.get(list.size()-1);
        System.out.println("sum " + sum) ;
        int p1 =0;
        int p2;

        for(int i = list.size()-1; i >0 ; i--){
            System.out.println(list.get(i));
            p1 = list.get(i);
            p2 = list.get(i-1);


            if(p1 > p2 ){
                sum -= p2;
            }else{
                sum+=p2;
            }

        }

        return sum;


    }


        public static int OptimalRomanToInt(String s) {
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int sum = 0;
            int prev = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                int curr = map.get(s.charAt(i));
                if (curr >= prev) {
                    sum += curr;
                } else {
                    sum -= curr;
                }
                prev = curr;
            }

            return sum;
        }

        public static int solution(String s){
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);


            int prev = 0;
            int sum = 0;

            for (int i = s.length()-1; i >=0; i-- ){
                int curr = map.get(s.charAt(i));
                if(curr >= prev){
                    sum+=curr;
                }else{
                    sum-=curr;
                }
                prev = curr;
            }


            return sum;
        }


    public static void main(String[] args) {
        System.out.println(OptimalRomanToInt("MCMXCIV"));
//        System.out.println();
        System.out.println(solution("MCMXCIV"));
    }
}
