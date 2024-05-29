import java.util.*;
public class Matrix{

    public static int frequencyFind(int[][] arr, int toFind){

        int freq = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                if(arr[i][j] == toFind){
                    freq++;
                }
            }

        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix numbers");
        for(int i = 0; i<rows; i++){
            for(int j=0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Matrix : ");

        for(int i = 0; i<rows; i++){
            for(int j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("Enter the number to find its frequency");

        System.out.println("Frequency :" + frequencyFind(matrix,sc.nextInt()));

    }
}