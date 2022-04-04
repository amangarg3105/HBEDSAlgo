package matrix;


import java.util.Scanner;

public class SetMatrixZero {

    public static  void setZeroes(int[][] matrix) {


        if(matrix ==  null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false, firstColZero = false;
        //Iterate the matrix
        for(int i = 0;  i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                    if(i == 0) {
                        firstRowZero = true;
                    }
                    if(j == 0) {
                        firstColZero = true;
                    }
                }
            }
        }

        //inner matrix loop
        for(int i = 1; i < rows; i++) {
            if(matrix[i][0] == 0) {
                for(int j = 1; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 1; j < cols; j++) {
            if(matrix[0][j] == 0) {
                for(int i = 1; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }


        if(firstRowZero) {
            for(int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        if(firstColZero) {
            for(int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter number of cols");
        int cols = scanner.nextInt();

        int [][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        setZeroes(matrix);

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
