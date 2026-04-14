import java.util.*;
public class Arrays9 {
    public static void main(String[] args) {
        //SECOND LARGEST IN AN ARRAY
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second Largest is :"+secondLargest);
    }
}
