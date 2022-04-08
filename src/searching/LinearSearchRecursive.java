package searching;


public class LinearSearchRecursive {

    public static boolean findElement(int []arr, int element, int index) {

        if(index >= arr.length) {
            return false;
        }
        if(arr[index] == element) {
            return true;
        }

        boolean ans = findElement(arr, element, index + 1);

        return ans;

    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 6};

        System.out.println(findElement(a, 4, 0));
    }

}
