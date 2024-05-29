import java.util.HashMap;
import java.util.Map;

public class Q409_LongestPalindrome {

    public static  int longestPalindrome(String s) {
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1)                           // longest palindrome were count is even + 1
                oddCount++;
            else
                oddCount--;
        }
        if (oddCount > 1)
            return s.length() - oddCount + 1; // We are keeping track of odd counts , coz odd counts wont help in making
                                                // longest palindrome
        return s.length();

    }

    public static void main(String[] args) {
        String s = "abccccddxy";
        System.out.println(longestPalindrome(s));
    }
}
