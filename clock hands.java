import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String t=in.next();
			StringTokenizer st=new StringTokenizer(t,":");
			int h=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			if(h==0 && m==0)
				break;
			Double a=Math.abs(0.5*(60*h-11*m));
			if(a>180)
				a=360-a;
			System.out.printf("%.3f\n",a);
		}
	}
}
