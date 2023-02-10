package array;

import java.util.Scanner;

public class Demo18MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] addition = addMatrices(matrix1, matrix2);
        printMatrix(addition);
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int column = 0; column < result[row].length; column++) {
                result[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Printing the matrix");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] acceptMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows & columns");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }


}
