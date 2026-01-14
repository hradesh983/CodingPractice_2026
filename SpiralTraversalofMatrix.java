import java.util.*;

class SpiralTraversalofMatrix {

    public static List<Integer> spiral(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> ans = spiral(matrix);

        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
