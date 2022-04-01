
public class Loops {


    public static void diamondPattern(int n) {

        for(int i = 1; i <= n; i++) {

            //space printing
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }

        //next lines print
        for(int i = n - 1; i >= 1; i--) {
            //space printing
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();


        }
    }

    public static void main(String[] args) {

       /* for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print("*" + " ");
            }

        }*/

       diamondPattern(5);



    }
}
