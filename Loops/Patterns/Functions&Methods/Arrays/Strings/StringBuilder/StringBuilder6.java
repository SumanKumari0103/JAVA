import java.util.Scanner;

public class StringBuilder6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String name = sc.nextLine();

        String rev = "";

        for(int i = name.length() - 1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }

        System.out.println("Reverse String is: " + rev);

        sc.close();
    }
}