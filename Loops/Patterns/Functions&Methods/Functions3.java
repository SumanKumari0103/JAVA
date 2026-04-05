import java.util.*;

public class Functions3 {
    public static int Product(int a,int b){
       int pro=a*b;
       return pro; 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the Second number :");
        int b=sc.nextInt();
        int product=Product(a,b);
        System.out.println("The product of two number is:"+product);
    }
}
