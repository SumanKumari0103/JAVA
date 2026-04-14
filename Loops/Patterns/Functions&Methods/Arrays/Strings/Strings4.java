import java.util.*;

public class Strings4 {
    public static void main(String[] args) {
        //CharAt
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you first name:");
        String first_name=sc.nextLine();
        System.out.print("Enter your second name:");
        String second_name=sc.nextLine();
        String fullName=first_name+" "+second_name;
        System.out.println("The length of string is:"+fullName.length());
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
