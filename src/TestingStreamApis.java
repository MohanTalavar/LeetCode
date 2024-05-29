import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestingStreamApis {

    public static void main(String[] args) {

//        List<String> list = Arrays.asList("apple","banana","cherry");
//        list.stream().
//                filter(s-> s.startsWith("a")).
//                forEach(System.out::println);

        int[] data = {10, 20, 3, 2, 1, 100, -1};
        IntStream intStream = Arrays.stream(data);
        intStream
                .sorted()
                .forEach(s -> System.out.print(s + " "));

    }
}
