//Bai toan 8 hau.
import java.io.*;
public class bt8hau
{
	public static void main(String[] args)
	{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			String a[][];
			a=new String[8][8];
			int i, j, x, y;
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
			int t=8;
			for(j=0; j<8; j++)
			{
				for(i=0; i<8; i++)
				{
					bt8hau(a, t, i, j);
					for(int j1=0; j1<8; j1++)
					{
						for(int i1=0; i1<8; i1++)
						{
							a[i1][j1]="| ";
						}
					}
				}
			}
			System.out.println();
		
	}
	public static void bt8hau(String a[][], int t, int x, int y)
	{
		int i, j;
		a[x][y]="|H";
		for(j=0; j<8; j++)
		{
			for(i=0; i<8; i++)
			{
				if((i==x)||(j==y)||(x+y==i+j)||(x-y)==(i-j))
				{
					a[i][j]="|.";
					if((i==x)&&(j==y))
					{
						a[i][j]="|H";
					}
				}
			}
		}
		if(t>1)
		{
			for(j=0; j<8; j++)
			{
				for(i=0; i<8; i++)
				{
					if(a[i][j]=="| ")
					{
						x=i;
						y=j;
						bt8hau(a, t-1, x ,y);
					}
				}
			}
		}
		if(t==1)
		{
			System.out.print("\nKet qua:");
			for(j=0; j<8; j++)
			{
				System.out.print("\n");
				for(i=0; i<8; i++)
				{
					System.out.print(a[i][j]);
				}
				System.out.print("|");
			}
		}
	}
}