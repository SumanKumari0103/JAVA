import java.util.*;
public class Arrays7 {
    public static void main(String[] args) {
        //LARGEST ELEMENT IN AN ARRAY
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the numbers in an array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element is :"+largest);
    }
}
