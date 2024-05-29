import java.util.Arrays;

public class StringApi {
    public static void main(String[] args) {

        String str = "Helloo    Mohan     ";
        char[] arr = str.toCharArray();

        for(char c : arr){
            System.out.print(c);
        }
        System.out.println();
        //System.out.println(str.replaceAll("\\s+",""));

//        System.out.println(str.replaceAll("[^a-zA-Z-0-9]",""));

        System.out.println(str.trim());
        System.out.println(Arrays.toString(str.split("\\s+")));
    }


}