//Bai toan 8 hau.
//In ra tat ca ket qua.
import java.io.*;
public class bt8hau2
{
	public static void main(String[] args)
	{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			String a[][];
			a=new String[8][8];
			int i, j;
			//Tao ban co trong.
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
			//Tao 1 quan co random o hang 1.
			int y=0;
			for(i=0; i<8; i++)
			{
				//De quy.
				bt8hau(a, i, 0);
				int i1=i;
				//Xoa quan co vua tao de tiep tuc vong lap i.
				a[i1][0]="| ";
			}
			System.out.println();
		
	}
	public static void bt8hau(String a[][], int x, int y)
	{
		int i, j;
		//Tao quan hau H.
		a[x][y]="|H";
		//Tao duong chieu cua quan hau vua tao.
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
		if(y<7)
		{
				for(i=0; i<8; i++)
				{
					if(a[i][y+1]=="| ")
					{
						x=i;
						bt8hau(a, x ,y+1);
					}
					//Xoa cac ky tu vua tao trong ham If.
					xoa(a, y);
				}
		}
		//Xuat ket qua neu du 8 quan hau.
		if(y==7)
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
	public static void xoa(String a[][], int y)
	{
		int i, j;
		int i1, j1;
		//Lam trong cac hang phia duoi hang y.
		for(j=y+1; j<8; j++)
		{
			for(i=0; i<8; i++)
			{
				a[i][j]="| ";
			}
		}
		//Tao lai cac duong chieu cua quan hau truoc do.
		for(j=0; j<y+1; j++)
		{
			for(i=0; i<8; i++)
			{
				if(a[i][j]=="|H")
				{
					for(i1=0; i1<8; i1++)
					{
						for(j1=0; j1<8; j1++)
						{
							if((i1==i)||(j1==j)||(i1+j1==i+j)||(i1-j1)==(i-j))
							{
								a[i1][j1]="|.";
								if((i1==i)&&(j1==j))
								{
									a[i1][j1]="|H";
								}
							}
						}
					}
				}
			}
		}
	}
}