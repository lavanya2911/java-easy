
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


class Main {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) 
		{
			LinkedList<Character> a=new LinkedList<>();
			int b=0;
			for (char c : s.toCharArray())
			 {
				if (c=='[') 	
					b=0;
				else if (c==']')	
					 b=a.size();
				else	
					 a.add(b++,c);
			}
			StringBuilder sb=new StringBuilder();
			for(char c:a)		
				sb.append(c);
			System.out.println(sb.toString());
		}
		}
}	

