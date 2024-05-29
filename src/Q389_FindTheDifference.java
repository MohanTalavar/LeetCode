public class Q389_FindTheDifference {

    public static char findTheDifference(String s, String t) {

        char c = 0;
        for(char cs : s.toCharArray()) c ^=cs;
        for(char ct : t.toCharArray()) c ^=ct;
        return c;

    }

    public static void main(String[] args) {
        String s ="abcd";
        String t = "abtcd";
        System.out.println(findTheDifference(s,t));
    }
}
