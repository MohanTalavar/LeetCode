public class tester {

    public static boolean isPalindrome(int x) {

        int temp =x;
//        int digs = (int) Math.log10(x)+1;
        int ans = 0;

        while(x > 0){
            int rem = x % 10;
            ans = ans *10 + rem;
            x /= 10;
        }

        return ans == temp;

    }
    public static void main(String[] args) {
        int x= -1221;
        System.out.println(isPalindrome(x));
    }
}
