//Nhap vao vi tri 1 quan ma, in ra cac buoc de quan ma chay het ban co ma khong trung cac nuoc di truoc.
import java.io.*;
public class btma
{
	public static void main(String[] args)
	{
		try{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			String a[][];
			a=new String[8][8];
			String b[];
			b=new String[63];
			int i, j, x, y;
			int t=1;
			for(j=0; j<8; j++)
			{
				for(i=0; i<8; i++)
				{
					a[i][j]="| ";
				}
			}
			System.out.print("\nBan co: ");
			for(j=0; j<8; j++)
			{
				System.out.print("\n");
				for(i=0; i<8; i++)
				{
					System.out.print(a[i][j]);
				}
				System.out.print("|");
			}
			System.out.print("\nNhap vao vi tri quan ma: ");
			System.out.print("\nx=");
			String x1=iK.readLine();
			x=(Integer.parseInt(x1)-1);
			System.out.print("\ny=");
			String y1=iK.readLine();
			y=(Integer.parseInt(y1)-1);
			a[x][y]="|M";
			System.out.print("\nBan co cua ban: ");
			for(j=0; j<8; j++)
			{
				System.out.print("\n");
				for(i=0; i<8; i++)
				{
					System.out.print(a[i][j]);
				}
				System.out.print("|");
			}
			for(j=y-2; j<=y+2; j++)
			{
				if((j<0)||(j>=8)||(j==y))
				{
					continue;
				}
				for(i=x-2; i<=x+2; i++)
				{
					if((i<0)||(i>=8)||(i==x)||(i-j==x-y-4)||(i-j==x-y)||(i+j==x+y+4)||(i-j==x-y-2)||(i+j==x+y))
					{
						continue;
					}
					else
					{
						a[i][j]="|.";
						chay(a, i, j, t, b);
						a[i][j]="| ";
					}
				}
			}
			System.out.println();
		}
		catch (Exception e){
			System.out.print(e.toString());
		}
	}
	public static void chay(String a[][], int x, int y, int t, String b[])
	{
		b[t-1]=(x+1)+" "+(y+1);
		int i, j;
		if(t<63)
		{
			for(j=y-2; j<=y+2; j++)
			{
				if((j<0)||(j>=8)||(j==y))
				{
					continue;
				}
				for(i=x-2; i<=x+2; i++)
				{
					if((i<0)||(i>=8)||(i==x)||(i-j==x-y-4)||(i-j==x-y)||(i+j==x+y+4)||(i-j==x-y-2)||(i+j==x+y))
					{
						continue;
					}
					else if(a[i][j]=="| ")
					{
						a[i][j]="|.";
						chay(a, i, j, t+1, b);
						a[i][j]="| ";
					}
				}
			}
		}
		if(t==63)
		{		
			for(int i1=0; i1<63; i1++)
			{
				System.out.print("\nBuoc thu "+(i1+1)+": "+"Quan ma di chuyen sang o "+b[i1]);
			}
			System.out.println("\nKet thuc.");
		}
	}
}