//Tong cac so khong trung nhau trong mang
import java.io.*;
public class tongktrung
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int i, j;
		int s=0;
		int a[];
		a=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.print("Nhap vao so thu "+(i+1)+" cua mang: ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.println("Mang vua nhap vao la:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
			s=s+a[i];
		}
		System.out.println("Tong cua mang vua nhap la "+s);
		for(i=0; i<n-1; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(a[i]==a[j])
				{
					s=s-a[i];
					j=n;
				}
			}
		}
		System.out.println("Tong cac so khong trung nhau trong mang la "+s);
		System.out.println();
	}
}