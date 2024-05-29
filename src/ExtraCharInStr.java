public class ExtraCharInStr {

        public static int minExtraChar(String s, String[] dictionary) {
            int n = s.length(); // Get the length of the input string 's'
            int[] dp = new int[n + 1]; // Initialize an array 'dp' to store minimum extra characters

            // Initialize dp[0] to 0 since there are no extra characters at the beginning
            dp[0] = 0;

            // Iterate through the input string 's' from the first character (i = 1)
            for (int i = 1; i <= n; i++) {
                dp[i] = dp[i - 1] + 1; // Initialize dp[i] to the maximum possible extra characters

                // Iterate through the words in the dictionary
                for (String word : dictionary) {
                    int len = word.length(); // Get the length of the current dictionary word

                    // Check if the current word exists as a substring ending at position 'i'
                    if (i >= len && s.substring(i - len, i).equals(word)) {
                        dp[i] = Math.min(dp[i], dp[i - len]); // Update dp[i] with the minimum extra characters
                    }
                }
            }

            return dp[n]; // Return the minimum extra characters for the entire input string 's'
        }

    public static void main(String[] args) {

        String s = "leetscode";
        String[] dictionary = {"leet","code","leetcode"};
        System.out.println(minExtraChar(s,dictionary));

    }

}


