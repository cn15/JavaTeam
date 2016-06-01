//Xoa 1 so khoi mang
import java.io.*;
public class xoaso
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int i;
		int a[];
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
		System.out.print("\nNhap vi tri so can xoa: ");
		String j1=iK.readLine();
		int j=Integer.parseInt(j1);
		for(i=j-1; i<n-1; i++)
		{
			a[i]=a[i+1];
		}
		n--;
		System.out.println("\nMang sau khi xoa:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}