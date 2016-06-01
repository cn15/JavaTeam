import java.io.*;
public class daomang
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int i, j;
		int a[];
		a=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.print("Nhap vao so thu "+(i+1)+" cua mang: ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.println("Mang vua nhap la: ");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0; i<n/2; i++)
		{
			j=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=j;
		}
		System.out.println("Mang sau khi sap xep la: ");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}