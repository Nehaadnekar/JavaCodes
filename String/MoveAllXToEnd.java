import java.util.*;
public class Main {
	public static String moveXtoLast(String s,String ans){
	String raw="";
		for(int i=0; i<s.length();i++){
			if(s.charAt(i)=='x'){
				raw=raw+s.charAt(i);
				
			}
			else{
				ans=ans+s.charAt(i);
				
			}
		}
		ans= ans+raw;
	return ans;

	}
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String ans="";
		
		System.out.print(moveXtoLast(s, ans));

    }
}
