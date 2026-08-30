/*Rotate a given square matrix by 90 degrees clockwise */
package Day_14;
import java.util.Scanner;
class Rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Rotate the matrix by 90 degrees clockwise
        System.out.println("Rotated Matrix by 90 degrees clockwise:");
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        
        
        }
    }
