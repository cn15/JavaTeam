import java.io.*;
public class nhan
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap vao a: ");
		String a = ins.readLine();
		int a1=Integer.parseInt(a);
		System.out.print("Nhap vao b: ");
		String b = ins.readLine();
		int b1=Integer.parseInt(a);
		System.out.println("Tich cua a va b la: "+(a1*b1));
	}
}