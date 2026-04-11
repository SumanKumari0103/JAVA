import java.util.*;
public class Functions8 {
    public static void Average(int a, int b, int c){
        int sum=a+b+c;
        System.out.println("The sum is :" +sum);
        int avg=sum/3;
        System.out.println("The average of three number is :" +avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        Average(a,b,c);
    }
}
