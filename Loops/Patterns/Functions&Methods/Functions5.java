import java.util.*;
public class Functions5 {
    public static void EvenOdd(int n){
        if(n%2==0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        EvenOdd(num);
    }
}
