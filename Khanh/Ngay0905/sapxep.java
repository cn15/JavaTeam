import java.io.*;
public class sapxep
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.print("Nhap vao so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int a[];
		a=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.print("Nhap vao phan tu thu "+(i+1)+" cua mang: ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.println("Mang vua nhap vao la: ");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		int min, j;
		for(i=0; i<n-1; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(a[j]<a[i])
				{
					min=a[i];
					a[i]=a[j];
					a[j]=min;
				}
			}
		}
		System.out.println("Mang sau khi sap xep la: ");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}