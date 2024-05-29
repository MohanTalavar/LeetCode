import java.util.HashMap;
import java.util.Map;

public class Q290_WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        String[] strArr = s.split(" ");
        char[] chArr = pattern.toCharArray();

        Map<Character,String> map = new HashMap<>();

        for( int i=0; i<chArr.length; i++){

            if(map.containsKey(chArr[i])){
                if(!map.get(chArr[i]).equals(strArr[i])){
                    return false;
                }
            }

            map.put(chArr[i], strArr[i]);

        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));

    }

}
