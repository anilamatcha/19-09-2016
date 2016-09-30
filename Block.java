import java.util.*;
import java.lang.*;
public class Block
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Blo b =new Blo();
		System.out.println("Enter string");
		String s=in.nextLine();
		int sum=b.maxBlock(s);
		System.out.println(sum);
	}
}
class Blo
{
	public int maxBlock(String a)
	{
		int c=1,count=0;
		if(a.length()==1)
		{
			count=1;
		}
		else if(a.length()>0)
		{
			for(int i=1;i<a.length();i++)
			{
				if(a.charAt(i)==a.charAt(i-1))
				{
					c=c+1;
					if(c>count)
					{
						count=c;
					}
				}
				else
				{
					c=1;
				}
			}
		}
		else
		{
			count=0;
		}
	return count;
	}
}
