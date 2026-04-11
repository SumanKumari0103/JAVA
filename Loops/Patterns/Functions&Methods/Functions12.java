import java.util.*;
public class Functions12 {
    public static void Vote(int n){
        if(n>18){
            System.out.println("Eligible for Vote");
        }
        else
        System.out.println("Not Eligible for vote");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Age :");
        int age =sc.nextInt();
        Vote(age);
    }
}
