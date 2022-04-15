package searching;


public class BinarySearchRecursion {

    public static boolean search(int[] arr, int element, int start, int end) {

        if(start > end) {
            return false;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == element) {
            return true;
        }

        if(arr[mid] > element) {
            boolean leftAns = search(arr, element, start, mid - 1);
            return leftAns;
        } else {
            boolean rightAns = search(arr, element, mid + 1, end);
            return rightAns;
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 10, 11, 13, 15};

        System.out.println(search(a, 5, 0, a.length - 1));
    }
}
