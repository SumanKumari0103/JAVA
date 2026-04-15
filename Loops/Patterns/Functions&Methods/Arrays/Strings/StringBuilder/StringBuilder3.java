import java.util.*;

public class StringBuilder3 {
    public static void main(String[] args) {
        //Set character
        StringBuilder sb=new StringBuilder("Ankit");
        System.out.println(sb);
        sb.setCharAt(0, 'S');
        System.out.println(sb);
    }
}
