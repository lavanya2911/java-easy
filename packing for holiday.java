import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[] arg)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int c=1;
		while(t-->0)
		{
			int k=in.nextInt();
			int l=in.nextInt();
			int m=in.nextInt();
			if(k>20||l>20||m>20)
				System.out.println("Case"+" "+c+":"+" "+"bad");	
			else
				System.out.println("Case"+" "+c+":"+" "+"good");
			c++;
		}
	}
}
