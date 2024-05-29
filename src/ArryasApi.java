import java.util.Arrays;
import java.util.List;

public class ArryasApi {

    public static void main(String[] args){

        Integer[] arr = {3,4,5,6};

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list1 = Arrays.asList(arr);

        System.out.println(list);
        System.out.println(list1);

        Integer[] newArr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArr).getClass().getSimpleName());
        System.out.println("newArr :" + newArr.getClass().getSimpleName());
        System.out.println("list " + list.getClass().getSimpleName());

    }
}
