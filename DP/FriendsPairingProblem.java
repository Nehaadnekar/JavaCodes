/*Given n friends, each one can remain single or can be paired up with some other friend. 
Each friend can be paired only once.
Find out the total number of ways in which friends can remain single or can be paired up.
*/
import java.util.*;
public class Main {
	private static long ways(int n,long[] dp){
		if(n==0 || n==1 || n==2){
			return n;
		}
		if(dp[n]!= -1){
			return dp[n];
		}
		long single = ways(n-1,dp);
		long pair = ways(n-2,dp)*(n-1);
		dp[n] = single + pair;
		return dp[n];

	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t ;i++){
			int n = sc.nextInt();
			long[] dp = new long[n+1];
			Arrays.fill(dp,-1);
			System.out.println(ways(n,dp));
		}
    }
}
