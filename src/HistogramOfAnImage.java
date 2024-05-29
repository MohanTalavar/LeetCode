import java.util.*;
public class HistogramOfAnImage {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{2,2,2},{3,3,3}};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i < arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                map.put(arr[i][j] , map.getOrDefault(arr[i][j],0)+1 );
            }
        }

        System.out.println("map" +map);

        StringBuilder sb= new StringBuilder();
        sb.append("{");

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            sb.append(entry.getKey() + ":");
            sb.append(entry.getValue() + ", ");
        }
        sb.delete(sb.length()-2,sb.length());

        sb.append("}");
        System.out.println(sb);
    }
}
