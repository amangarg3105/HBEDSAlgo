
public class Arrays {


    public static void main(String[] args) {
        int a[] = new int[5];
        int matrix [][] = new int[2][3];
        a[1] = 5;
        test(a);
        System.out.println(a[1]);
    }

    public static void test(int [] a) { // a = null
        System.out.println(a);
        a = new int[5];
        a[1] = 8;
    }
}
