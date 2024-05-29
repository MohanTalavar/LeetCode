public class twoStringAnagram {

        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[] charCount = new int[26]; // Assuming only lowercase English letters

            // Count characters in string s
            for (char ch : s.toCharArray()) {
                charCount[ch - 'a']++;
            }

            // Decrement character counts for string t
            for (char ch : t.toCharArray()) {
                if (charCount[ch - 'a'] == 0) {
                    return false; // Character not present in string s
                }
                charCount[ch - 'a']--;
            }

            return true; // If all character counts are zero, they are anagrams
        }

        public static void main(String[] args) {
            String s1 = "anagram";
            String t1 = "nagaram";
            String s2 = "rat";
            String t2 = "car";

            System.out.println(isAnagram(s1, t1)); // Output: true
            System.out.println(isAnagram(s2, t2)); // Output: false
        }
    }

