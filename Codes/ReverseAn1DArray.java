import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j = n;
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[j - 1] = arr[i];
            j = j - 1;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
        
    }
}
