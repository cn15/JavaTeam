package InterfaceTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chay {

	public static void main(String[] args) {
		C c = new C();
		int x=0, y=0;
		try{
			BufferedReader iK=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao x: ");
			String x1=iK.readLine();
			x=Integer.parseInt(x1);
			System.out.print("\nNhap vao y: ");
			String y1=iK.readLine();
			y=Integer.parseInt(y1);
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
		c.cong(x, y);
		c.nhan(x, y);
	}

}
