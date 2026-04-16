import java.util.*;

public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the numbers in an array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
