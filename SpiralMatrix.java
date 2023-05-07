import java.util.*;;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                ans.add(matrix[startRow][j]);
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                ans.add(matrix[endRow][j]);
            }

            // left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                ans.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 96 }, { 5, 6, 7, 8, 97 }, { 9, 10, 11, 12, 98 }, { 13, 14, 15, 16, 99 },
                { 17, 18, 19, 20, 100 } };
        System.out.println(spiralOrder(matrix));
    }
}
