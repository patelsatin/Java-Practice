package Practice;
import java.util.Scanner;
public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the matrix: ");
        int rowSize = sc.nextInt();
        System.out.println("Enter the column size of the matrix: ");
        int colSize = sc.nextInt();
        sc.close();
        int[][] matrix = new int[rowSize][colSize];
        System.out.println("Matrix created for " + rowSize + "x" + colSize);

        // Practice: implement inputMatrix method
        inputMatrix(matrix);

        // Practice: implement printMatrix method
        printMatrix(matrix);

        // Practice: implement printMatrixZigZag method
        printMatrixZigZag(matrix);

        // Call other methods after implementing them
        System.out.println("Sum of the matrix: " + sumMatrix(matrix));
        rowWiseSum(matrix);
        colWiseSum(matrix);
        System.out.println("Search element: " + searchElement(matrix, 5));
        System.out.println("Main diagonal: ");
        printMainDiagonal(matrix);
        System.out.println("Secondary diagonal: ");
        printSecondaryDiagonal(matrix);
        System.out.println("Transpose matrix: ");
        int[][] transposeMatrix = transposeMatrix(matrix);
        printMatrix(transposeMatrix);
        System.out.println("Rotate 90 matrix: ");
        int[][] rotate90 = rotate90(matrix);
        printMatrix(rotate90);
        System.out.println("Boundary elements: ");
        printBoundary(matrix);
        System.out.println("Wave traversal: ");
        waveTraversal(matrix);
        System.out.println("Saddle point: ");
        findSaddlePoint(matrix);
    }

    /**
     * Fill the matrix with values (e.g., 1 to n*n).
     * Example for 3x3 matrix:
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    private static void inputMatrix(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Print the matrix in row-wise order.
     * Example for 3x3 matrix:
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    private static void printMatrix(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Print the matrix in zig-zag/spiral order.
     * Example for 3x3 matrix:
     * 1 2 3 6 9 8 7 4 5
     */
    private static void printMatrixZigZag(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Return the sum of all elements in the matrix.
     * Example for 3x3 matrix:
     * sumMatrix([[1,2,3],[4,5,6],[7,8,9]]) => 45
     */
    private static int sumMatrix(int[][] matrix) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Print sum of each row.
     * Example for 3x3 matrix:
     * Row 0 sum = 6
     * Row 1 sum = 15
     * Row 2 sum = 24
     */
    private static void rowWiseSum(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Print sum of each column.
     * Example for 3x3 matrix:
     * Col 0 sum = 12
     * Col 1 sum = 15
     * Col 2 sum = 18
     */
    private static void colWiseSum(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Search for a target element in the matrix.
     * Return true if found, false otherwise.
     * Example:
     * searchElement([[1,2,3],[4,5,6],[7,8,9]], 5) => true
     * searchElement([[1,2,3],[4,5,6],[7,8,9]], 10) => false
     */
    private static boolean searchElement(int[][] matrix, int target) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Print the main diagonal of the matrix.
     * Example for 3x3 matrix:
     * 1 5 9
     */
    private static void printMainDiagonal(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Print the secondary diagonal of the matrix.
     * Example for 3x3 matrix:
     * 3 5 7
     */
    private static void printSecondaryDiagonal(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Return the transpose of the matrix.
     * Example for 3x3 matrix:
     * Input:  1 2 3
     *         4 5 6
     *         7 8 9
     * Output: 1 4 7
     *         2 5 8
     *         3 6 9
     */
    private static int[][] transposeMatrix(int[][] matrix) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Rotate the matrix 90 degrees clockwise.
     * Example for 3x3 matrix:
     * Input:  1 2 3
     *         4 5 6
     *         7 8 9
     * Output: 7 4 1
     *         8 5 2
     *         9 6 3
     */
    private static int[][] rotate90(int[][] matrix) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Print boundary elements of the matrix.
     * Example for 3x3 matrix:
     * 1 2 3 6 9 8 7 4
     */
    private static void printBoundary(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Print wave traversal (column-wise up and down)
     * Example for 3x3 matrix:
     * 1 4 7 8 5 2 3 6 9
     */
    private static void waveTraversal(int[][] matrix) {
        // TODO: Implement this method
    }

    /**
     * Find and print a saddle point (smallest in row, largest in column)
     * Example for 3x3 matrix:
     * Input:  11 12 13
     *         21 22 23
     *         31 32 33
     * Output: "No Saddle Point"
     */
    private static void findSaddlePoint(int[][] matrix) {
        // TODO: Implement this method
    }
}
