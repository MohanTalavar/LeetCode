public class StringApisTest {
    public static void main(String[] args) {
        String s = "              Mohan          Talavar        RM @#@#!#$ ";
        System.out.println(s.trim());

        // Remove all white spaces
        s = s.replaceAll("\\s+", "");
        System.out.println(s);

        // Remove special characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        // Reverse the string
//        char[] chars = s.toCharArray();
//        int length = chars.length;
//        for (int i = 0; i < length / 2; i++) {
//            char ch = chars[i];
//            chars[i] = chars[length - i - 1];
//            chars[length - i - 1] = ch;
//        }
//        s = new String(chars);
//        System.out.println(s);


        char[] chars = s.toCharArray();

        int ln = chars.length;

        for(int i=0; i<ln/2;i++){
            char ch = chars[i];
            chars[i] = chars[ln-1-i];
            chars[ln-1-i] = ch;
        }
        s = new String(chars);

        System.out.println("Reversed: "+s);

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
        System.out.println(" capacity :"+sb.capacity());
        System.out.println("length: "+ sb.length());












    } // end of main






//        StringBuilder sb = new StringBuilder("mohan");
//        System.out.println( "StingB: "+sb);
    }

