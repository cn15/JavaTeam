//Xoa so bi trung trong mang
import java.io.*;
public class xoasotrung
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int i, j, k;
		int a[];
		a=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.print("Nhap vao so thu "+(i+1)+" cua mang: ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.println("\nMang vua nhap vao la:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0; i<n-1; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(a[i]==a[j])
				{
						for(k=j; k<n-1; k++)
						{
							a[k]=a[k+1];
						}
					n--;
					j--;
				}
			}
		}
		System.out.println("\nMang sau khi xoa cac so bi trung:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}