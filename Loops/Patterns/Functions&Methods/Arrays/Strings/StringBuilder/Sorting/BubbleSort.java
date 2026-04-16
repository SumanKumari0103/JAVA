import java.util.*;
public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       // int arr[]={7,8,3,1,2};
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter size of the array:");
       int size=sc.nextInt();
       int arr[]=new int[size];
       System.out.print("Enter the numbers in an array :");
       for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
       }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted Array:");
        printArray(arr);
    }
}
