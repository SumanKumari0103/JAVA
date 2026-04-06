import java.util.*;
public class Functions6 {
    public static void Table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + "X" + i +"=" +(n*i));
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       Table(num); 
    }
}
