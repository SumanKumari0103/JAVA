import java.util.*;

public class Strings3 {
    public static void main(String[] args) {
        //Length
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you first name:");
        String first_name=sc.nextLine();
        System.out.println("Enter your second name:");
        String second_name=sc.nextLine();
        String full_name=first_name +" "+second_name;
        System.out.println("The length of string is:"+full_name.length());
    }
}
