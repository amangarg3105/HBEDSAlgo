package searching;


public class LinearSearch {


    public static boolean findElement(int[] arr, int element) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == element) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] a = {5, 1, 4, 2, 6};

        System.out.println(findElement(a, 3));

    }
}
