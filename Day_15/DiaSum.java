/*Problem: Given a matrix, calculate the sum of its primary diagonal elements. The primary diagonal consists of elements where row index equals column index.

Input:
- First line: two integers m and n
- Next m lines: n integers each

Output:
- Print the sum of the primary diagonal elements

Example:
Input:
3 3
1 2 3
4 5 6
7 8 9

Output:
15

Explanation:
1 + 5 + 9 = 15 */


package Day_15;
import java.util.*;
class DiaSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the rows and columns ....");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("enter the values of the matrix ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
//printing the sum of the diagonal elemets of matrix////
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (i==j){
                    sum=sum+matrix[i][j];
                 
                 }
                    
                }
            }
            System.out.println("sum of the diagonal elemets is "+sum);
        }
    }
