/*Problem: Write a program to check whether a given square matrix is an Identity Matrix. An identity matrix is a square matrix in which all diagonal elements are 1 and all non-diagonal elements are 0.

Input:
- First line: integer n representing number of rows and columns
- Next n lines: n integers each representing the matrix elements

Output:
- Print "Identity Matrix" if the matrix satisfies the condition
- Otherwise, print "Not an Identity Matrix"

Example:
Input:
3
1 0 0
0 1 0
0 0 1

Output:
Identity Matrix */
package Day_14;
import java.util.Scanner;
class IdentityMat {
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

        //CHECKING FOR IDENTITY MATRIX
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && matrix[i][j]!=1 || i!=j && matrix[i][j]!=0){
                    System.out.println("Not an Identity Matrix");
                    return;
                }
            }
        }
        System.out.println("Identity Matrix");
    }
}