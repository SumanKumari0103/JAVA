import java.util.*;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the value of columns:");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the values:");

        for(int i = 0; i < rows; i++) {         
            for(int j = 0; j < cols; j++) {  
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value you want search:");
        int x=sc.nextInt();

        System.out.println("Matrix is:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j]==x){
                    System.out.println("X found at location :("+ i + ","+ j +")");
                }
            }
        }
    }
}