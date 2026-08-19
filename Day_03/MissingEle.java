import  java.util.*;
public class MissingEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array/n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int xor=0;
        for(int i=1;i<=arr.length+1;i++){
            xor^=i;
        }
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        System.out.println("The missing element is: " + xor);
    
    }

    
}
