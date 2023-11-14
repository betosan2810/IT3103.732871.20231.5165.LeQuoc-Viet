//Le Quoc Viet 20215165
package lab01_java;

public class Matrix {
	public static void main(String[] args) {
        // khoi tao 2 ma tran
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        // kiem tra xem 2 ma tran co cung kich thuoc
        if (areMatricesSameSize(matrix1, matrix2)) {
            // cong 2 ma tran
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            // hien thi ket qua
            System.out.println("Ma tran 1:");
            printMatrix(matrix1);

            System.out.println("\nMa tran 2:");
            printMatrix(matrix2);

            System.out.println("\nKet qua cong 2 ma tran:");
            printMatrix(resultMatrix);
        } else {
            System.out.println("Ma tran khong cung kich thuoc nen khong cong duoc!");
        }
    }

    // Function check 2 ma tran co cung kich thuoc khong?
    private static boolean areMatricesSameSize(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    // Function cong 2 ma tran
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function de in ra ma tran
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }



}
