import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int v=in.nextInt();
			int t=in.nextInt();
			int d=2*t*v;
			System.out.println(d);
		}
	}
}
