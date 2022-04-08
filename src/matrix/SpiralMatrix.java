package matrix;


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(true) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            if(left > right || top > bottom) {
                break;
            }


            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            right--;

            if(left > right || top > bottom) {
                break;
            }


            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }

            bottom--;
            if(left > right || top > bottom) {
                break;
            }


            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }

            left++;
            if(left > right || top > bottom) {
                break;
            }

        }

        return result;

    }

    public List<Integer> spiralOrderRecursive(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();

        spiralHelper(matrix, result, 0, matrix.length -1, 0, matrix[0].length - 1);
        return result;
    }

    private void spiralHelper(int[][] matrix, ArrayList<Integer> result, int rowStart, int rowEnd, int colStart, int colEnd) {


        if(rowStart > rowEnd ||  colStart > colEnd) {
            return;
        }

        //Print TOP boundary
        for(int i = colStart; i <= colEnd; i++) {
            result.add(matrix[rowStart][i]);
        }

        //Print Right Column boundary
        for(int i = rowStart + 1; i <= rowEnd; i++) {
            result.add(matrix[i][colEnd]);
        }


        if(rowStart == rowEnd || colStart == colEnd) return;

        //Print Bottom row Boundary
        for(int i = colEnd - 1; i >= colStart; i--) {
            result.add(matrix[rowEnd][i]);
        }

        //Print left boundary
        for(int i = rowEnd - 1; i >= rowStart + 1; i--) {
            result.add(matrix[i][colStart]);
        }

        spiralHelper(matrix, result, rowStart + 1, rowEnd - 1,
                colStart + 1, colEnd - 1);
    }


    public static void main(String[] args) {

    }
}
