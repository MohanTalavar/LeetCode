public class teseter {

    public static void main(String[] args) {

//        String s = "100";
//        int val = Integer.parseInt(s);
//        System.out.println(val);
//        val *= 2;
//        s = Integer.toString(val);
//        System.out.println(s);
//        Integer.reverse(val);
//        System.out.println(val);


        int a = 54321;
        StringBuilder sb = new StringBuilder(Integer.toString(a));
        System.out.println(sb);
        sb.reverse();
         a = Integer.parseInt(sb.toString());
        System.out.println(a);
    }
}
