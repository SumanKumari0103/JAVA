public class Recursion6 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        towerOfHanoi(n-1, src, dest, helper);
    }
    public static void main(String[] args) {
        //TOWE OF HANNOI
        int n=3;
    }
}
