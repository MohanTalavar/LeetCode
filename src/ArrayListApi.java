
import java.util.*;
public class ArrayListApi {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        System.out.println(list);

        for(String s : list){
            System.out.println(s);
        }

        System.out.println(list.contains("Banana"));
        System.out.println(list.remove("Banana"));
        System.out.println(list);
        System.out.println(list.contains("Banana"));

        System.out.println();
        list.forEach(System.out::println);


    }
}
