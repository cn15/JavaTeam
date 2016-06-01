import java.io.*;
public class mang
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int a[];
		a=new int[n];
		int i;
		for(i=0; i<n; i++)
		{
			System.out.print("\nNhap vao so thu "+(i+1)+" cua mang: ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.println("\nMang vua nhap la:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}