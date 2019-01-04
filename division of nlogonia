import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	public static void main(String[] args)
 {

		Scanner in = new Scanner(System.in);
		int t;
		while ((t = in.nextInt()) != 0) 
		{
			int x = in.nextInt(), y = in.nextInt();
			for (int i = 0; i < t; i++) {
				int x1 = in.nextInt(), y1 = in.nextInt();
				if (x1 > x && y1 > y)
					System.out.println("NE\n");
				else if (x1 > x && y1 < y)
					System.out.println("SE\n");
				else if (x1 < x && y1 < y)
					System.out.println("SO\n");
				else if (x1 < x && y1 > y)
					System.out.println("NO\n");
				else 
					System.out.println("divisa\n");
			}
		}
	}

}

