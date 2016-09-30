import java.util.*;
import java.lang.*;
public class Sum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		SumDig sd=new SumDig();
		System.out.println("Enter string");
		String s=in.nextLine();
		int sum=sd.sumDigits(s);
		System.out.println(sum);
	}
}
class SumDig
{
	public int sumDigits(String a)
	{
		int n=0;
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(Character.isDigit(c))
			{
				String l=a.substring(i,i+1);
				n=n+Integer.parseInt(l);
			}
		}
		return n;
	}
}
