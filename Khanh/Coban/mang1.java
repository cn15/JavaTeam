import java.io.*;
public class mang1
{
	public static void main(String[] args) throws IOException
	{
		int i;
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int a[];
		a=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.print("Nhap vao phan tu thu "+(i+1)+": ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.print("Mang vua nhap vao la: ");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nSo nho nhat trong mang la "+timMin(a, n));
		System.out.println();
	}
	public static int timMin(int a[], int n)
	{
		int i;
		int min=a[0];
		for(i=0; i<n; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
}