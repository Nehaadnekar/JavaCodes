import java.util.*;
public class Main{
  public static int climbingStairs(int n){
    if(n==1||n==2){
      return n;
    }
    int dp[] = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;
    for(int i=3;i<=n;i++){
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = climbingStairs(n);
    System.out.print(ans);
  }
}
