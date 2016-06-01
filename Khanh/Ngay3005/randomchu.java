//Xuat ra random 1 chu cai hoa hoac thuong va so ASCII cua no.
import java.io.*;
import java.util.Random;
public class randomchu
{
	public static void main(String[] args)
	{
		Random rd = new Random();
		int k=rd.nextInt(52)+65;
		if(k>90)
		{
			k=k+6;
		}
		System.out.print("\n"+(char)k+" "+k+"\n");
	}
}