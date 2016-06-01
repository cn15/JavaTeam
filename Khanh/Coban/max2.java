//Tim so lon nhi cua mang
import java.io.*;
public class max2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao so phan tu cua mang: ");
		String n1=iK.readLine();
		int n=Integer.parseInt(n1);
		int i, max, max2;
		int a[];
		a=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.print("\nNhap vao phan tu thu "+(i+1)+" cua mang: ");
			String ai=iK.readLine();
			a[i]=Integer.parseInt(ai);
		}
		System.out.println("\nMang vua nhap la:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
			max=a[1];
			max2=a[0];
		
		if(a[0]>a[1])
		{
			max=a[0];
			max2=a[1];
		}
		else
		{
			max=a[0];
			if(n<3)
			{
				System.out.print("\nMang khong co so lon nhi");
			}
			else
			{
				for(i=2; i<n; i++)
				{
					if(a[i]<max2)
					{
						max2=a[i];
						break;
					}
				}
			}
		}
		for(i=2; i<n; i++)
		{
			if(a[i]>max)
			{
				max2=max;
				max=a[i];
				continue;
			}
			if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		if(max==max2)
		{
			System.out.print("\nMang khong co so lon nhi");
		}
		else
		{
			System.out.print("\nSo lon nhat cua mang la "+max);
			System.out.print("\nSo lon nhi cua mang la "+max2);
		}
		System.out.println();
	}
}