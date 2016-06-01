//Viet hoa cac chu cai dau tien cua tu trong cau (abc xyz -> Abc Xyz)
//Chua hoan thanh
import java.lang.String;
import java.io.*;
public class Viethoa2
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Nhap vao chuoi: ");
			String nhap=iK.readLine();
			nhap=nhap.toLowerCase();
			//Tao 1 mang co cac phan tu la cac ky tu, cach nhau boi dau cach.
			String[] arr = nhap.split(" ");
  			String sB = new String();
			for (int i = 0; i < arr.length; i++)
			{
        		sB=sB.concat(arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1)+(" "));
    		}
    		System.out.print("\n"+sB);
    		System.out.print("\n");
		}
		catch (IOException e)
		{
			System.out.print(e.toString());
		}
	}
}