
public class DataTypes {


    public static void main(String[] args) {





        double d = 17.77;

        long l = 363534843570941l;

        int a = (int) l;

        System.out.println(a);


        int sum = 5 + 3;
        int multiply = 5 * 3;
        int division = 5  / 3;
        int modulo = 5 % 3;
        System.out.println(modulo);

        int x = 5;

       /* int exp = x++ + ++x; // 5 + 7
        System.out.println(exp);*/

        int exp2 = ++x + ++x + x++; //6 + 7 + 7
        System.out.println(exp2);
        System.out.println(x);

        int i = 10;

        int k = 15;

        //Short circuit
        if(i > 10 && ++k > 15) {
            System.out.println(k);
        } else {
            System.out.println(k);
        }


        //turn++ = turn = turn + 1;
        //++turn - > turn = turn + 1


        /**
         * 0 ->index
         * 0 > index_1
         * 0 > index_1
         * 1 > index_1
         * 1 > index
         * 0 >index_1
         * 0> index _1
         * 1 > index _1
         * 2 > index
         *  * 0 >index_1
         *          * 0> index _1
         *          * 1 > index _1
         *
         * 3
         * 4
         * 0
         * 1
         *
         *
         */
       /* for(int index = 0; index < 5;index++) {
            System.out.println(index);
            if(index == 3) {
                continue;
            }
            for(int index_1 = 0; index_1 < 5; index_1++) {
                System.out.println(index_1);
                if(index_1 == 1) {
                    break;
                }
                System.out.println(index_1);
            }

        }*/




       for(int index = 0; index < 5; index++) {
           System.out.println(index);
           if(index == 3) {
               break;
           }
       }

       testMethod();

    }

    public static  void testMethod() {

        int a  = 5;
        System.out.println(a);

    }
}
