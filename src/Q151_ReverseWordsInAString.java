public class Q151_ReverseWordsInAString {

    public static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");

        String out = "";

        for(int i = str.length-1; i>=0; i--){
            out+= str[i] + " ";
        }

        return out.trim();

    }

    public static void main(String[] args) {
        String s = "    hello        world    I   am      Mohan      ";
        System.out.println(reverseWords(s));
    }
}
