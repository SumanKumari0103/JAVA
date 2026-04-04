import java.util.Scanner;
public class Product {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a digits");
    int n=sc.nextInt();
    int product=1;
    while(n>0){
        int digit=n%10;
        product=product*digit;
        n=n/10;
    }
    System.out.println("The product of digit is:"+product);
   } 
}
