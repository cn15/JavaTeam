//Xoa 1 so khoi mang
import java.io.*;
public class xoanhieuso
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int i, j;
		int a[];
		int b=0;
		a=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.print("\nNhap vao so thu "+(i+1)+" cua mang: ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.println("\nMang vua nhap:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nNhap so luong so can xoa khoi mang: ");
		String k1=iK.readLine();
		int k=Integer.parseInt(k1);
		for(k=k; k>0; k--)
		{
			b++;
			System.out.print("\nNhap vi tri so thu "+b+" can xoa: ");
			String j1=iK.readLine();
			j=Integer.parseInt(j1);
			for(i=j-b; i<n-1; i++)
			{
				a[i]=a[i+1];
			}
			n--;
		}
		System.out.println("\nMang sau khi xoa:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}