package Day_06;
import java.util.*;
public class Remove_dupli {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array"); 
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Array with duplicates removed:");
    Set<Integer> uniqueElements = new HashSet<>();
    for (int num : arr) {
        uniqueElements.add(num);
    }
    for (int num : uniqueElements) {
        System.out.print(num + " ");
    }
    sc.close();
}

}