import java.util.*;
public class Functions2 {
    public static int Sum(int a, int b){
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first numbre :");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();
        int sum=Sum(a,b);
        System.out.println("The sum of two number is :"+sum);
    }
}
