import java.util.*;

public class Strings2 {
    public static void main(String[] args) {
        //Concatenation
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you first name:");
        String first_name=sc.nextLine();
        System.out.println("Enter your second name:");
        String second_name=sc.nextLine();
        String full_name=first_name +" "+second_name;
        System.out.println("Full name is:"+full_name);
    }
}
