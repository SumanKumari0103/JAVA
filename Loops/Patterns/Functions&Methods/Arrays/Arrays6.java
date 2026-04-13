import java.util.*;
public class Arrays6 {
    public static void main(String[] args) {
        //Transpose of Matrix
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows of matrix:");
        int rows=sc.nextInt();
        System.out.println("Enter the columns of matrix");
        int cols=sc.nextInt();

        int arr[][]=new int[rows][cols];
        System.out.println("Enter the values :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of Matrix is :");
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
