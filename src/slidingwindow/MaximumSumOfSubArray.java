package slidingwindow;


public class MaximumSumOfSubArray {


    /**
     * T.C = O(n * k)
     * @param arr
     * @param k
     * @return
     */
    public static int maximumSum(int [] arr, int k) {

        int finalMaxSum = 0;
        for(int index = 0; index <= arr.length - k ; index++) {

            int endWindowBound = index + k;
            int currentWindowSum = 0;
            for(int j = index; j < endWindowBound; j++) {
                currentWindowSum = currentWindowSum + arr[j];
            }
            if(currentWindowSum > finalMaxSum) {
                finalMaxSum = currentWindowSum;
            }
        }
        return finalMaxSum;
    }


    /***
     * T.C - O(n)
     * @param arr
     * @param k
     * @return
     */
    public static int maximumSumOptimized(int [] arr, int k) {


        int finalMaxSum = 0;

        for(int index  = 0; index < k; index++) {
             finalMaxSum = finalMaxSum + arr[index];
        }

        int currentSum = finalMaxSum;
        for(int index = k; index < arr.length; index++) {
            currentSum =  currentSum  + arr[index];
            int outsideElement = arr[index - k];

            currentSum = currentSum - outsideElement;
            if(currentSum > finalMaxSum) {
                finalMaxSum = currentSum;
            }

        }
        return finalMaxSum;
    }





    public static void main(String[] args) {
        int[] a = {1, 5, 10, 11, 13, 15};

        System.out.println(maximumSumOptimized(a, 3));
    }
}
