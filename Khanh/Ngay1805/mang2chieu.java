//Nhap vao mang 2 chieu
//In ra theo thu tu tang dan cac so Fibonacci, so nguyen to, so chinh phuong, so hoan hao trong mang.
import java.io.*;
public class mang2chieu
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao chieu dai mang: ");
			String n1=iK.readLine();
			int n=Integer.parseInt(n1);
			System.out.print("\nNhap vao chieu rong mang: ");
			String m1=iK.readLine();
			int m=Integer.parseInt(m1);
			int a[][];
			a=new int[n][m];
			int i, j;
			int t=0;
			for(j=0; j<m; j++)
			{
				for(i=0; i<n; i++)
				{
					t++;
					System.out.print("\nNhap vao so thu "+t+" cua mang: ");
					String ai=iK.readLine();
					a[i][j]=Integer.parseInt(ai);
				}
			}
			t=0;
			System.out.print("\nMang vua nhap la:");
			for(j=0; j<m; j++)
			{
				System.out.print("\n");
				for(i=0; i<n; i++)
				{
					System.out.print(a[i][j]+" ");
				}
			}
			//Chuyen ve mang 1 chieu.
			int b[];
			b=new int[n*m];
				for(j=0; j<m; j++)
			{
				for(i=0; i<n; i++)
				{
					b[t]=a[i][j];
					t++;
				}
			}
			t=b[0];
			for(i=0; i<n*m; i++)
			{
				for(j=i+1; j<n*m; j++)
				{
					if(b[j]<b[i])
				{
						t=b[i];
						b[i]=b[j];
						b[j]=t;
					}
				}
			}
			//Tim so lon nhat trong mang.
			int max=a[0][0];
			for(j=0; j<m; j++)
			{
				for(i=0; i<n; i++)
				{
					if(a[i][j]>max)
					{
						max=a[i][j];
					}
				}
			}
			System.out.print("\nDanh sach cac so Fibonacci trong mang: ");
			fibo(n, m, a, max);
			System.out.print("\nDanh sach cac so nguyen to trong mang: ");
			songuyento(n, m, b);
			System.out.print("\nDanh sach cac so chinh phuong trong mang: ");
			sochinhphuong(n, m, b);
			System.out.print("\nDanh sach cac so hoan hao trong mang: ");
			sohoanhao(n, m, b);
			System.out.println();
		}
		catch (IOException e)
		{
			System.out.print(e.toString());
		}
	}
	public static void fibo(int n, int m, int a[][], int max)
	{
		int i, j, k;
		int fibo[];
		//Tao mang chua day so Fibonacci, voi so lon nhat cua day nho hon hoac bang so lon nhat trong mang 2 chieu da nhap.
		fibo=new int[max];
		fibo[0]=0;
		fibo[1]=1;
		int p=2;
		for(k=2; k<max; k++)
		{
			p++;
			fibo[p-1]=fibo[p-2]+fibo[p-3];
			if(fibo[p-1]>max)
			{
				p--;
				break;
			}
		}
		//So sanh
		for(k=0;k<p;k++)
		{
			if(k==2)
			{
				continue;
			}
			for(j=0; j<m; j++)
			{
				for(i=0; i<n; i++)
				{
					if(a[i][j]==fibo[k])
					{
						System.out.print(a[i][j]+" ");
					}

				}
			}
		}
	}
	public static void songuyento(int n, int m, int b[])
	{
		int i, j, k;
		for(k=0; k<n*m; k++)
		{
			j=0;
			if(b[k]<2)
			{
				continue;
			}
			if(b[k]==2)
			{
				System.out.print(b[k]+" ");
				continue;
			}
			for(i=2; i<b[k]; i++)
			{
				if(b[k]%i==0)
				{
					j++;
					i=b[k];
				}
			}
			if(j==0)
			{
				System.out.print(b[k]+" ");
			}
		}
	}
	public static void sochinhphuong(int n, int m, int b[])
	{
		int i, k;
		for(k=0; k<n*m; k++)
		{
			if(b[k]==1)
			{
				System.out.print(b[k]+" ");
				continue;
			}
			for(i=1; i<b[k]; i++)
			{
				if(i*i==b[k])
				{
					System.out.print(b[k]+" ");
					i=b[k];
				}
			}
		}
	}
	public static void sohoanhao(int n, int m, int b[])
	{
		int i, k, j;
		for(k=0; k<n*m; k++)
		{
			j=0;
			for(i=1; i<b[k]; i++)
			{
				if(b[k]%i==0)
				{
					j=j+i;
				}
			}
			if((j==b[k])&&(j>0))
			{
				System.out.print(b[k]+" ");
			}
		}
	}
}