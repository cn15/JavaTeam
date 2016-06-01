import java.io.*;
public class sosanh
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iA=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao a: ");
		String a=iA.readLine();
		int a1=Integer.parseInt(a);
		System.out.print("Nhap vao b: ");
		String b=iA.readLine();
		int b1=Integer.parseInt(b);
		if(a1>b1)
		{
			System.out.println(a1+" to hon "+b1);
		}
		if(a1<b1)
		{
			System.out.println(a1+" nho hon "+b1);
		}
		if(a1==b1)
		{
			System.out.println("2 so vua nhap bang nhau");
		}
	}
}