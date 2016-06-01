import java.lang.String;
import java.io.*;
public class Suaten
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao ten cua ban: ");
			String iN=iK.readLine();
			iN=iN.toLowerCase();
			String iNn = iN.substring(0, 1).toUpperCase() + iN.substring(1);
			String iNnn=iNn.concat(" da thich dieu nay phai khong ");
			iNnn=iNnn.concat(iNn+"?");
			System.out.print("\n"+iNnn+"\n");
		}
		catch (Exception e)
		{
			System.out.print(e.toString());
		}
	}
}