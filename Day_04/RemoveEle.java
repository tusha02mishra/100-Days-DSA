package Day_04;
import java.util.*;
public class RemoveEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be removed:");
        int ele = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != ele) {
                arr[count++] = arr[i];
            }
        }
        System.out.println("Array after removing " + ele + ":");
        for(int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
