import java.util.*;
import java.io.*;
class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int b=in.nextInt();
			int sg=in.nextInt();
			int sb=in.nextInt();
			PriorityQueue<Integer> qg = new PriorityQueue<Integer>(sg, new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    if (o1 > o2) {
                        return -1;
                    }
                    return 1;
                }
            });
			for (int i = 0; i < sg; i++) {
                qg.add(in.nextInt());
            }

            PriorityQueue<Integer> qb = new PriorityQueue<Integer>(sb, new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    if (o1 > o2) {
                        return -1;
                    }
                    return 1;
                }
            });
            for (int i = 0; i < sb; i++) {
                qb.add(in.nextInt());
            }

			while(true)
			{
				if(qg.isEmpty() && qb.isEmpty())
				{
					System.out.println("green and blue died");
					break;
				}
				else if(qg.isEmpty())
				{
					System.out.println("blue wins");
					while(!qb.isEmpty())
					{
					System.out.println(qb.poll());
					}
					break;
				}
				else if(qb.isEmpty())
				{
					System.out.println("green wins");
					while(!qg.isEmpty())
					{
					System.out.println(qg.poll());
					}
					break;
				}
				else
				{
					int c=0;
					List<Integer> lg=new ArrayList<Integer>();
					List<Integer> lb=new ArrayList<Integer>();
					while(!qg.isEmpty() && !qb.isEmpty() && c<b)
					{
						int a=qg.poll();
						int d=qb.poll();
						if(a>d)
						{
							lg.add(a-d);
						}
						else if(a<d)
						{
							lb.add(d-a);
						}
						c++;
					}
							qg.addAll(lg);
							qb.addAll(lb);
				}
			}
				if(t>0)
				{
					System.out.println();
				}
		}
	}
}


