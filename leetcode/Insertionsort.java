import java.util.*;

public class Insertionsort {
    static void inssort(int n,int arr[]){
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elts:");
        for(int i=0;i<n;i++){
            arr[i]+=sc.nextInt();
        }
        inssort(n,arr);
    }
}
