import java.util.*;
public class Main {
	static long countWays(int S[], int m, int n)
    {
        long table[] = new long[n+1];
        Arrays.fill(table, 0); 
        table[0] = 1;
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
 
        return table[n];
    }
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0;i<m;i++){
			arr[i] = sc.nextInt();
		}
        System.out.println(countWays(arr, m, n));
    }
}
