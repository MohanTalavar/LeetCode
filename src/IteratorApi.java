import java.util.*;

public class IteratorApi {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();


        list.add(12);
        list.add(122);
        list.add(123);
        list.add(-12);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){

            int i = itr.next();
            System.out.println(i);
            if( i < 50){
                itr.remove();
            }
        }

        System.out.println(list);



    }
}
