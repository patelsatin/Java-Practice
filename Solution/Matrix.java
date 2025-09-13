package Solution;
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
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int count = 1;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                matrix[i][j] = count++;
            }
        }
    }

    /**
     * Print the matrix in row-wise order.
     * Example for 3x3 matrix:
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    private static void printMatrix(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Print the matrix in zig-zag/spiral order.
     * Example for 3x3 matrix:
     * 1 2 3 6 9 8 7 4 5
     */
    private static void printMatrixZigZag(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix.length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i]);
                System.out.print(" ");
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd]);
                System.out.print(" ");
            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(matrix[rowEnd][i]);
                System.out.print(" ");
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][colStart]);
                System.out.print(" ");
            }
            colStart++;
        }
    }

    /**
     * Return the sum of all elements in the matrix.
     * Example for 3x3 matrix:
     * sumMatrix([[1,2,3],[4,5,6],[7,8,9]]) => 45
     */
    private static int sumMatrix(int[][] matrix) {
        int sum = 0;
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * Print sum of each row.
     * Example for 3x3 matrix:
     * Row 0 sum = 6
     * Row 1 sum = 15
     * Row 2 sum = 24
     */
    private static void rowWiseSum(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        for (int i = 0; i < rowSize; i++) {
            int rowSum = 0;
            for (int j = 0; j < colSize; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            System.out.println("Row: " + (i + 1) + " has total sum: " + rowSum);
        }
    }

    /**
     * Print sum of each column.
     * Example for 3x3 matrix:
     * Col 0 sum = 12
     * Col 1 sum = 15
     * Col 2 sum = 18
     */
    private static void colWiseSum(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        for (int i = 0; i < rowSize; i++) {
            int colSum = 0;
            for (int j = 0; j < colSize; j++) {
                colSum = colSum + matrix[j][i];
            }
            System.out.println("Column: " + (i + 1) + " has total sum: " + colSum);
        }
    }

    /**
     * Search for a target element in the matrix.
     * Return true if found, false otherwise.
     * Example:
     * searchElement([[1,2,3],[4,5,6],[7,8,9]], 5) => true
     * searchElement([[1,2,3],[4,5,6],[7,8,9]], 10) => false
     */
    private static boolean searchElement(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Print the main diagonal of the matrix.
     * Example for 3x3 matrix:
     * 1 5 9
     */
    private static void printMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Print the secondary diagonal of the matrix.
     * Example for 3x3 matrix:
     * 3 5 7
     */
    private static void printSecondaryDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length - 1, p = 0; j >= 0; j--, p++) {
                if (i == p) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Return the transpose of the matrix.
     * Example for 3x3 matrix:
     * Input: 1 2 3
     * 4 5 6
     * 7 8 9
     * Output: 1 4 7
     * 2 5 8
     * 3 6 9
     */
    private static int[][] transposeMatrix(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int transposeMatrix[][] = new int[colSize][rowSize];
        for(int i=0; i< rowSize; i++) {
            for(int j=0; j< colSize; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    /**
     * Rotate the matrix 90 degrees clockwise.
     * Example for 3x3 matrix:
     * Input: 1 2 3
     * 4 5 6
     * 7 8 9
     * Output: 7 4 1
     * 8 5 2
     * 9 6 3
     */
    private static int[][] rotate90(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int transpose90Matrix[][] = new int[colSize][rowSize];
        for(int i=rowSize-1, n = 0; i >= 0; i--, n++) {
            for(int j=0; j< colSize; j++) {
                transpose90Matrix[j][n] = matrix[i][j];
            }
        }
        return transpose90Matrix;
    }

    /**
     * Print boundary elements of the matrix.
     * Example for 3x3 matrix:
     * 1 2 3 6 9 8 7 4
     */
    private static void printBoundary(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        for(int i =0 ; i< rowSize; i++) {
          for (int j=0; j< colSize; j++) {
          	if(i == 0 || j == 0 || i == rowSize-1 || j == colSize -1) {
          	System.out.print(matrix[i][j] + " ");
          	}
          }
        }
        System.out.println();
    }

    /**
     * Print wave traversal (column-wise up and down)
     * Example for 3x3 matrix:
     * 1 4 7 8 5 2 3 6 9
     */
    private static void waveTraversal(int[][] matrix) {
        int rowStart = 0;
         int rowEnd = matrix.length-1;
         int colStart = 0;
         int colEnd = matrix[0].length-1;
         while(rowStart <= rowEnd && colStart <= colEnd) {
           for (int i=rowStart; i<= rowEnd; i++ ) {
             System.out.print(matrix[i][colStart]+ " ");
           }
           colStart++;
           if(colStart <= colEnd) {
           for (int i=rowEnd; i>= rowStart; i-- ) {
                System.out.print(matrix[i][colStart]+ " ");
              }
              colStart++;
           }
         }
         System.out.println();
    }

    /**
     * Find and print a saddle point (smallest in row, largest in column)
     * Example for 3x3 matrix:
     * Input: 11 12 13
     * 21 22 23
     * 31 32 33
     * Output: "No Saddle Point"
     */
    private static void findSaddlePoint(int[][] matrix) {
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            // Step 1: Find min element in the row
            int rowMin = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if it's the maximum in its column
            boolean isSaddle = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle point found: " + rowMin);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No saddle point exists");
        }
    }
}
