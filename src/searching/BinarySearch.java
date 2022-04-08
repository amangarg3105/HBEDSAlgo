package searching;


public class BinarySearch {

    public static boolean findElement(int [] arr, int element) {

        int start = 0;
        int end = arr.length - 1;


        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == element) {
                return true;
            }

            //Right side search
            if (arr[mid] < element) {
                start = mid + 1;
            }

            //Left side search
            if (arr[mid] > element) {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 10, 11, 13, 15};

        System.out.println(findElement(a, 16));

    }
}
