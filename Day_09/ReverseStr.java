/*Problem: A secret system stores code names in forward order. To display them in mirror format, you must transform the given code name so that its characters appear in the opposite order.

Input:
- Single line: a lowercase string containing only alphabetic characters (no spaces)

Output:
- Print the transformed code name after applying the mirror operation

Example:
Input:
hello

Output:
olleh

Explanation: The first character moves to the last position, the second to the second-last, and so on until the entire string is mirrored */
package Day_09;
import java.util.Scanner;
public class ReverseStr {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String codeName = Scanner.nextLine();
        String reversed = new StringBuilder(codeName).reverse().toString();
        System.out.println(reversed);
    }
    
}
