import java.util.*;
public class Functions10 {
    public static int Great(int a, int b){
        if(a>b)
        return a;
        else 
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number :");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int result=Great(a,b);
        System.out.println("The Great of two number is :" +result);
    }
    
}
