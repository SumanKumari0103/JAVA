import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the value of Radius");
        Double radius=sc.nextDouble();
        final float PI= 3.14F;
        Double Area=PI*radius*radius;
        System.out.println("Are of circle is :"+Area);

    }
}
