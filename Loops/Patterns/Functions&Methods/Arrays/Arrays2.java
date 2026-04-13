import java.util.*;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array :");
        int size = sc.nextInt();

        int num[] = new int[size];   // array create kiya

        System.out.println("Enter the values :");
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();   // values input li
        }

        System.out.println("The numbers are :");
        for(int i = 0; i < size; i++){
            System.out.println(num[i]);  // print kiya
        }
    }
}