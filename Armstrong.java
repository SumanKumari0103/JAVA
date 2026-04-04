import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not Armstrong");
        }
    }
}
