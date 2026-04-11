import java.util.*;
public class Functions9 {
    public static void SumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }

        }
        System.out.println("The sum of Odd number is :" +sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        SumOdd(num);
    }
    
}
