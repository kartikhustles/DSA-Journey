public class DiagonalSum {
    // Brute Force
    public static int DS(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
                else if (i + j == matrix.length -1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Optimised
    public static int OptimiseDS(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 96}, {5, 6, 7, 8, 97}, {9, 10, 11, 12, 98}, {13, 14, 15, 16, 99}, {17, 18, 19, 20, 100}};
        System.out.println(OptimiseDS(matrix));
        System.out.println(DS(matrix));
    }
}
