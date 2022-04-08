package recursion;


public class Factorial {


    public static  int fact(int n) {

        if(n <= 1) {
            return 1;
        }
        int smallAns = fact(n - 1);
        int bigAns = n * smallAns;

        return bigAns;
    }


    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
