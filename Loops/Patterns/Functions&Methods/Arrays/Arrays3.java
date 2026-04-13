import java.util.*;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the alement:");
        int size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter the Elements of the array:");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search :");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(num[i]==x){
                System.out.println("The number is found at index :"+i);
            }
        }
    }
}
