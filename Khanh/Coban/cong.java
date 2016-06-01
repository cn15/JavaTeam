
//them thu vien nhap xuat
import java.io.*;
public class cong
{
	public static void main(String[] args) throws Exception {
		//Tao doi tuong inStream thuc hien phuong thuc InputStreamReader tu class BufferedReader
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap vao a: ");
		String a = inStream.readLine();
		int ia = Integer.parseInt(a);
		System.out.println("Nhap vao b: ");
		String b = inStream.readLine();
		int ib = Integer.parseInt(b);
		System.out.print("Ket qua la :" +(ia-ib)+" dung khong ?");
		System.out.println();
	}
}
