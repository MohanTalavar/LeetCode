public class Q1208_GetEqaulSubstringWithinBudget {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "bcdf";

        int maxCost = 3;
        StringBuilder sb = new StringBuilder();
        int budget = 0;
        int prev = 0 ;

        for (int i = 0; i < s.length(); i++) {
            if(budget <= maxCost) {
                prev = budget;
                budget += Math.abs(s.charAt(i) - t.charAt(i));
                sb.append(s.charAt(i));
            }else{
                break;
            }
        }

        // TO DO LEARNING ==> SLIDING WINDOW
        System.out.println(sb.length()-1);

    }
}
