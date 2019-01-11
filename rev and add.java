import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
	public static long rev (long n)
	{
	 	long r=0;
		while(n>0)
		{
			r=r*10+n%10;
			n=n/10;
		}
		return r;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int c=0;
			long n=Long.parseLong(br.readLine());
			long r=rev(n);
			while(n!=r)
			{
				n+=r;
				r=rev(n);
				c++;
			}
		System.out.println(c+" "+n);
		}
	}
}



