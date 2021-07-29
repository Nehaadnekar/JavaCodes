import java.util.*;
public class Main {
		public static long fib(int n,long[] dp){
        if(n==1 || n==2){
            return n+1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        long c1 = fib(n-1,dp);
        long c2 = fib(n-2,dp);
        return dp[n] = c1+c2;
    }
	
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
			int n = sc.nextInt();
			long[] dp = new long[n+1];
            Arrays.fill(dp,-1);
            System.out.println(fib(n,dp));
		}
    }
}
