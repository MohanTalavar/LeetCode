public class FirstNonRepeatedCharInString {

    public static char solution(String s){

        char c = 0;
        for(char cs : s.toCharArray()) c^=cs;

        return c;

    }
    public static void main(String[] args) {
        System.out.println(solution("AABCDBE"));
    }
}
