import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int l=0;l<t;l++)
{
	String s=br.readLine();
	s= s.replaceAll("\\p{Punct}","");
    	s=s.replaceAll("\\s","");
		int d = (int) Math.sqrt(s.length()),k=0;
        	if(d*d!=s.length())
        	{
        	    System.out.println("Case #"+(l+1)+":\nNo magic :(");
        	    continue;
        	}
        	char s2[][]=new char[d][d];
        	for(int i=0;i<d;i++)
        	{
        	    for(int j=0;j<d;j++)
        	    {
        	        s2[i][j]=s.charAt(k++);
        	    }
		}
		String a="";
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<d;j++)
			{
				a=a+""+s2[i][j];
			}
		}
		if(!a.equals(s))
		{
			System.out.println("Case #"+(l+1)+":\nNo magic :(");
        	    	continue;
		}
		a="";
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<d;j++)
			{
				a=a+""+s2[j][i];
			}
		}
		if(!a.equals(s))
		{
			System.out.println("Case #"+(l+1)+":\nNo magic :(");
        	    	continue;
		}
		a="";
		for(int i=d-1;i>=0;i--)
		{
			for(int j=d-1;j>=0;j--)
			{
				a=a+""+s2[i][j];
			}
		}
		if(!a.equals(s))
		{
			System.out.println("Case #"+(l+1)+":\nNo magic :(");
        	    	continue;
		}
		a="";
		for(int i=d-1;i>=0;i--)
		{
			for(int j=d-1;j>=0;j--)
			{
				a=a+""+s2[j][i];
			}
		}
		if(!a.equals(s))
		{
			System.out.println("Case #"+(l+1)+":\nNo magic :(");
        	    	continue;
		}
		else
			System.out.println("Case #"+(l+1)+":\n"+d);
}
}
}		
