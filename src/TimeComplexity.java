import java.util.Scanner;

public class TimeComplexity {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        /**
         * n * log n -> n log n
         */
        for(int i = 0; i < n; i++) {
            System.out.println("Hello World");
            for(int j = 1; j < n; j *= 2) {
                System.out.println("Hello World");
                if(j == 1) {
                    break;
                }
            }
        }


        int a = 1;
        while(a  < n ){
            System.out.println("Hello World");
            a = a * 2;
        }





    }
}
