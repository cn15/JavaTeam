import java.io.*;
public class thaphanoi
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao so dia: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		char a, b, c;
		a='A';
		b='B';
		c='C';
		xepdia(n, a, b, c);
		System.out.println();
	}
	public static void xepdia(int n, char a, char b, char c)
	{
		if(n==1)
		{
			System.out.print("\nChuyen 1 dia tu coc "+a+" sang coc "+c);
		}
		else
		{
			xepdia(n-1, a, c, b);
			xepdia(1, a, b, c);
			xepdia(n-1, b, a, c);
		}
	}
}