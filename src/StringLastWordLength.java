public class StringLastWordLength {
    public static void main(String[] args) {
        String s = "    Hello         World123     ";
        System.out.println(s.trim());
        s=s.trim();
        System.out.println(s);

        int count = 0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        System.out.println(count);
    }
}
