import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Choose operation:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Remainder");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Addition:"+(a+b));
            break;
            case 2:
            System.out.println("Subtraction:"+(a-b));
            break;
            case 3:
            System.out.println("Multiplition:"+(a*b));
            break;
            case 4:
            System.out.println("Division:"+(a/b));
            break;
            case 5:
            System.out.println("Remainder:"+(a%b));
            break;
            default:
            System.out.println("Invalid choice");

        }
    }
}
