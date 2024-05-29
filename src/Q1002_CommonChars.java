import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1002_CommonChars {

    public static List<String> commonChars(String[] words) {

        List<String> commonChars = new ArrayList<>();
        int[] minFreq = new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);

        for(String currentString : words){

            int[] charFreq = new int[26];  // THESE ARE FILLED WITH 0 's

            for(char c : currentString.toCharArray()){
                charFreq[c-'a']++;
            }

            for(int i=0; i<26 ; i++){
                minFreq[i] = Math.min(minFreq[i],charFreq[i]);  // AFter 1st string most of max values in minfreq changed to 0 due to min ();
            }

        } // OUTER For loop

        for(int i=0; i<26; i++){
            while(minFreq[i]>0){  // INCLUDING DUPLICATES
                commonChars.add(""+ (char)(i+'a') );
                minFreq[i]--;
            }
        }

        return commonChars;
    }

    public static void main(String[] args) {
        String[] words = {"label","roller","bella"};
        System.out.println(commonChars(words));
    }

}
