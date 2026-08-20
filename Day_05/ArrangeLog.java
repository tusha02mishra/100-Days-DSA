package Day_05;
import java.util.*;
public class ArrangeLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1:");
        int n = sc.nextInt();
        System.out.println("Enter the size of the array2:");
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("Enter the elements of the array1:");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the array2:");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n + m];

        for(int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < m; i++) {
            arr3[n + i] = arr2[i];
        }

        System.out.println("Array after sorting:");
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    
}
