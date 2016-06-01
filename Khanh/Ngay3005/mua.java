import java.io.*;
import java.util.Random;
public class mua
{
	public static void main(String[] args)
	{
		Random rd=new Random();
		int x=0;
		int y=0;
		int i, j;
		int k=0;
		try{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao so luong Macbook:");
			String x1=iK.readLine();
			x=Integer.parseInt(x1);
			System.out.print("\nNhap vao so luong Surface Book:");
			String y1=iK.readLine();
			y=Integer.parseInt(y1);
			}
		catch (Exception e){
			System.out.print(e.toString());
		}
		int a[];
		int b[];
		a=new int [x];
		b=new int [y];
		for(i=0; i<x; i++)
		{
			a[i]=-1;			//Gia tri khong lien quan den may can mua.
		}
		for(i=0; i<y; i++)
		{
			b[i]=-1;
		}
		int i1=0;
		int j1=0;
		for(i=0; i<x+y; i++)
		{
			k=rd.nextInt(2);	//Random chon mua trong mang a hoac b.
			if(i1==x)			//Kiem tra da mua het trong mang a hay chua.
			{
				k=1;			//Chuyen sang mang b.
			}
			if(j1==y)			//Kiem tra da mua het trong mang b hay chua.
			{
				k=0;			//Chuyen sang mang a.
			}
			if(k==0)
			{
				k=rd.nextInt(a.length);
				for(j=0; j<x; j++)								//Kiem tra co trung hay khong.
				{
					if(k==a[j])
					{
						k=rd.nextInt(x);					//Random lai.
						j=-1;
						continue;
					}
				}
				a[i1]=k;
				i1++;
				System.out.print("\nMua Macbook "+(k+1));
				continue;
			}
			if(k==1)
			{
				k=rd.nextInt(b.length);
				for(j=0; j<y; j++)
				{
					if(k==b[j])
					{
						k=rd.nextInt(y);
						j=-1;
						continue;
					}
				}
				b[j1]=k;
				j1++;
				System.out.print("\nMua Surface Book "+(k+1));
				continue;
			}
		}
		System.out.print("\nMua xong roi.");
		System.out.println();
	}
}
