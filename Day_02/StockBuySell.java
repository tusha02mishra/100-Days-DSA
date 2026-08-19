package Day_02;
import java.util.*;
public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array/n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int maxprofit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            int profit=arr[i]-min;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
         System.out.println(maxprofit);
         sc.close();
    }

}
