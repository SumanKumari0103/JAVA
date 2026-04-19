public class Recursion4 {
    public static int CalculateFact(int n){
        if(n==1){
            return 1;
        }
        int fact=CalculateFact(n-1);
        int fact_n=n*fact;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=CalculateFact(n);
        System.out.println(ans);
    }
}
