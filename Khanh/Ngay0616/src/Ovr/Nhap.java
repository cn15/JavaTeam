package Ovr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nhap {
	public static void main(String[] args) {
		try {
			BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
			Students a = new Students();
			System.out.print("\nNhap ten: ");
			a.setName(iK.readLine());
			System.out.print("\nNhap gioi tinh: ");
			a.setSex(iK.readLine());
			System.out.print("\nNhap tuoi: ");
			String age1 = iK.readLine();
			a.setAge(Integer.parseInt(age1));
			System.out.print("\nNhap lop: ");
			a.setLop(iK.readLine());
			Human b = new Human();
			System.out.print("\nNhap ten: ");
			b.setName(iK.readLine());
			System.out.print("\nNhap gioi tinh: ");
			b.setSex(iK.readLine());
			System.out.print("\nNhap tuoi: ");
			String age2 = iK.readLine();
			b.setAge(Integer.parseInt(age2));
			a.Learn();
			b.Learn();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}