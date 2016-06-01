//Dao nguoc chuoi nhap vao
import java.lang.String;
import java.io.*;
public class Daochuoi
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao chuoi can dao: ");
			String st= iK.readLine();
			System.out.print("\nChuoi sau khi dao la: ");
			for(int i=st.length()-1; i>=0; i--)
			{
				System.out.print(st.charAt(i));
			}
			System.out.print("\n");
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
}