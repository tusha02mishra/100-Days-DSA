package Day_13;
import java.util.*;
class ListClo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and columns of the matrix in a list:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        // Perform clockwise traversal
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}