import java.util.*;
public class Functions11 {
    public static double Circumference(double r){
        return 2* Math.PI*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        double r=sc.nextInt();
        double result=Circumference(r);
        System.out.println("The Circumference of Corcle is :" +result);
    }
}
