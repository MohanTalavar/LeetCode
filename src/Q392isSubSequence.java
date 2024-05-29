public class Q392isSubSequence {
    public static boolean isSubsequence(String s, String t) {

        char[] given = s.toCharArray();
        char[] findIn = t.toCharArray();
        int p2 = 0;
        int p1 = 0;

        while (p1 < given.length && p2 < findIn.length) {
            if (given[p1] == findIn[p2]) {
                p1++;
            }
            p2++;
        }

        return p1 == given.length;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbdc";
        System.out.println(isSubsequence(s,t));
    }
}
