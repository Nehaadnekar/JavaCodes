import java.util.*;
public class Main {
	static int max(int a, int b)
    {
          return (a > b) ? a : b;
    }
	static int knapSack(int s, int sz[], int val[], int n)
    {
       int arr[] = new int[s + 1];
		for (int i = 1; i < n + 1; i++) {
			for (int j = s; j >= 0; j--) {
				if (sz[i - 1] <= j){
					arr[j] = max(arr[j],arr[j - sz[i - 1]] + val[i - 1]);
				}	
			}
		}
		return arr[s]; 
    }

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int sz[] = new int[n];
		int val[] = new int[n];
		for(int i=0;i<n;i++){
			sz[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			val[i] = sc.nextInt();
		}
		System.out.println(knapSack(s, sz, val, n));
    }
}

    
