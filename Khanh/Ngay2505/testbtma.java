//Chua hoan thanh.
import java.io.*;
public class testbtma
{
	public static void main(String[] args)
	{	
		int x, y;
		x=0; y=0;
		try{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao vi tri quan ma: ");
			System.out.print("\nx=");
			String x1=iK.readLine();
			x=(Integer.parseInt(x1)-1);
			System.out.print("\ny=");
			String y1=iK.readLine();
			y=(Integer.parseInt(y1)-1);
			}
		catch (Exception e){
			System.out.print(e.toString());
		}	
		String a[][];
		a=new String[8][8];
		String b[];
		b=new String[63];
		int i, j;
		int t=1;
		int k=0;
		for(j=0; j<8; j++)
		{
			for(i=0; i<8; i++)
			{
				a[i][j]="| ";
			}
		}
		a[x][y]="|M";
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
					chay(a, i, j, t, k, x, y);
					a[i][j]="| ";
					k=1;
					break;
				}
			}
			if(k==1)
			{
				break;
			}
		}
		System.out.print("\n");
	}
	public static void chay(String a[][], int x, int y, int t, int k, int x1, int y1)
	{
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
						chay(a, i, j, t+1, k, x, y);
						a[i][j]="| ";
						k++;
						if(k>0)
						{
							break;
						}
					}
				}
				if(k==1)
				{
					break;
				}
			}
			if(k<=0)
			{
			//a[x][y]="| ";
			//chay(a, x1, y1, t, -7, x1, y1);
			}
		}
		if(t==63)
		{
			System.out.println("\nKet thuc.");
		}
	}
}
