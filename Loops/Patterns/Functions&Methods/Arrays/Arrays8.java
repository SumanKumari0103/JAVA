import java.util.*;
public class Arrays8 {
    public static void main(String[] args) {
        //REVERSE ARRAY
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int arr[]=new int [size];
        System.out.println("Enter the elements in an array :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Reversed Array is :");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
    }
}
