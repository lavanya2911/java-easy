import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String d;
		while((d=br.readLine())!=null)
		{
			int n=Integer.parseInt(d);
			Stack<Integer> s=new Stack<>();
			boolean stk=true;
			Queue<Integer> q=new LinkedList<>();
			boolean qu=true;
			PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
			boolean pqu=true;
			for(int i=0;i<n;i++)
			{
				StringTokenizer st=new StringTokenizer(br.readLine());
				String k=st.nextToken();
				int v=Integer.parseInt(st.nextToken());
				if(k.equals("1"))
				{
					if(stk)
						s.push(v);
					if(qu)
						q.offer(v);
					if(pqu)
						pq.offer(v);
				}
				else if(k.equals("2"))
				{
					if(stk&&(s.size()==0||!s.pop().equals(v)))
					stk=false;
					if(qu&&(q.size()==0||!q.poll().equals(v)))
					qu=false;
					if(pqu&&(pq.size()==0||!pq.poll().equals(v)))
					pqu=false;
				}
			}
			if(!stk&&!qu&&!pqu)
			System.out.println("impossible");
			else if((stk&&qu)||(stk&&pqu)||(qu&&pqu))
			System.out.println("not sure");
			else if(stk)
			System.out.println("stack");
			else if(qu)
			System.out.println("queue");
			else if(pqu)
			System.out.println("priority queue");
		}
	}
}

