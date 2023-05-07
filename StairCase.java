public class StairCase {
    public static boolean stairCase(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Found key at (" +row+ ", " +col+ ")");
                return true;
            }
            else if (matrix[row][col] > target) {
                col--;
            }
            else if (matrix[row][col] < target) {
                row++;
            }
        }
        System.out.println("Target element is not found in the matrix!");
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int target = 33;
        stairCase(matrix, target);
    }
}
