//Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc: họ…đệm…tên; chuyển xâu đó sang biểu diễn theo cấu trúc tên…đệm.họ//
import java.lang.String;
import java.io.*;
public class bt0905
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao ho va ten: ");
			String nhap=iK.readLine();
			nhap=nhap.toLowerCase();
			String[] arr=nhap.split(" ");
			String a;
			a=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=a;
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