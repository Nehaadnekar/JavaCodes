import java.util.*;
public class Main
{
    static int divide(int x, int y)
	{
		while (x % y == 0)
			x = x / y;
		return x;
	}
	static int isUgly(int no)
	{
		no = divide(no, 2);
		no = divide(no, 3);
		no = divide(no, 5);

		return (no == 1) ? 1 : 0;
	}
	static int getUgly(int n)
	{
		int i = 1;
		int count = 1;
		while (n > count) {
			i++;
			if (isUgly(i) == 1)
				count++;
		}
		return i;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		System.out.println(getUgly(num));
	}
}
