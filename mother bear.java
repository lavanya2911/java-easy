import java.util.*;
import java.io.*;
import java.lang.*;
 class bear
{
  public static void main(String args[ ])throws IOException
  {
 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
   String l;
   while(!(l=in.readLine()).equals("DONE"))
{
   l=l.replaceAll("[\\p{Punct} ]","");
   l=l.toLowerCase();
    boolean valid=true;
    for(int i=0;i<l.length()/2 && valid;i++)
{
     valid=l.charAt(i)==l.charAt(l.length()-i-1);
} 
  System.out.println(valid ? "You won't be eaten!" : "Uh oh..");
}}}
