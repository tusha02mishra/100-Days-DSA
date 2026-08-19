package Day_01;
import java.util.Scanner;

/*Problem: Write a C program to insert an element x at a given 1-based position pos in an array of n integers. Shift existing elements to the right to make space.

Input:
- First line: integer n
- Second line: n space-separated integers (the array)
- Third line: integer pos (1-based position)
- Fourth line: integer x (element to insert)

Output:
- Print the updated array (n+1 integers) in a single line, space-separated

Example:
Input:
5
1 2 4 5 6
3
3

Output:
1 2 3 4 5 6

Explanation: Insert 3 at position 3, elements [4,5,6] shift right*/
public class InsertElementInArray {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};
        int element=25;
        int position=3;

        int newArr[]=new int [arr.length+1];

        for(int i=0;i<position-1;i++){
            newArr[i]=arr[i];

        }
        newArr[position-1]=element;
        for(int i=position;i<newArr.length;i++){
            newArr[i]=arr[i-1];
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
