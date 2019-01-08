import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
public static void main(String[]arg)
{
Scanner in=new Scanner(System.in);
int t=in.nextInt();
while(t-->0)
{
int a=in.nextInt();
int b=in.nextInt();
if(a<b || (a+b)%2!=0)
{
System.out.println("impossible");
}
else
{
int s=(a+b)/2;
int d=(a-b)/2;
System.out.println(Math.max(s,d)+" "+Math.min(s,d));
}
}
}
}
