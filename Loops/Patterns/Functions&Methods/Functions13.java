import java.util.*;
public class Functions13 {
    public static int Power(int x, int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result = result*x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value  of x :");
        int x=sc.nextInt();
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        int ans=Power(x,n);
        System.out.println("the power is :" +ans);
    }
}
