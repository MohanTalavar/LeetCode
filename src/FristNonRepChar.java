public class FristNonRepChar {

    public static int idxOfNonRepChar(String s){
        for(int i = 0; i<s.length();i++){
            if(s.substring(i+1).indexOf(s.charAt(i))==-1){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "ovvgxlwv";
        System.out.println(idxOfNonRepChar(s));
    }
}
