//Viet hoa cac chu cai dau tien cua tu trong cau (abc xyz -> Abc Xyz)
//Chua hoan thanh
import java.lang.String;
import java.io.*;
public class Viethoa
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
			//Tao doi tuong chua chuoi moi sau khi da ghep.
  			StringBuffer sB = new StringBuffer();
			for (int i = 0; i < arr.length; i++)
			{
        		sB.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        		//System.out.print("\n"+arr[i]);
    		}
    		System.out.print("\n"+sB.toString());
    		System.out.print("\n");
		}
		catch (IOException e)
		{
			System.out.print(e.toString());
		}
	}
}