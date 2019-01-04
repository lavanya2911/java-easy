import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main(String[]arg)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt())
			{
				int p=in.nextInt();
				int a=in.nextInt();
				int h=in.nextInt();
				int w=in.nextInt();
				int b[]=new int[w];
				int min=Integer.MAX_VALUE;
				for(int i=0;i<h;i++)
				{
				   int s=in.nextInt();
					for(int j=0;j<w;j++)
					{
						b[j]=in.nextInt();
						if(b[j]>=p && (s*p)<=a)
						{
					 		int temp=s*p;
					 		if(temp<min)
					 		 min=temp;
						}
					}
				}
				if(min<a)
					System.out.println(min);
				else
					System.out.println("stay home");
		}
	}
}

