package DuongTron;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DuongTron {

	public static void main(String[] args) {
		int r1 = 0, x1 = 0, y1 = 0, r2 = 0, x2 = 0, y2 = 0;
		try {
			BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap ban kinh duong tron thu 1: ");
			String rr1 = iK.readLine();
			r1 = Integer.parseInt(rr1);
			System.out.println("\nNhap toa do tam duong tron 1:");
			System.out.print("\nx = ");
			String xx1 = iK.readLine();
			x1 = Integer.parseInt(xx1);
			System.out.print("\ny = ");
			String yy1 = iK.readLine();
			y1 = Integer.parseInt(yy1);
			System.out.print("\nNhap ban kinh duong tron thu 2: ");
			String rr2 = iK.readLine();
			r2 = Integer.parseInt(rr2);
			System.out.println("\nNhap toa do tam duong tron 2:");
			System.out.print("\nx = ");
			String xx2 = iK.readLine();
			x2 = Integer.parseInt(xx2);
			System.out.print("\ny = ");
			String yy2 = iK.readLine();
			y2 = Integer.parseInt(yy2);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		if ((r1 == r2) && (x1 == x2) && (y1 == y2)) {
			System.out.print("\n2 duong tron trung nhau.");
		} else {
			double d;
			d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			if ((r1 + r2 == d)) {
				System.out.print("\n2 duong tron cat nhau tai 1 diem.");
			} else if (r1 + r2 < d) {
				System.out.print("\n2 duong tron eo cat nhau.");
			} else {
				if ((r1 + d < r2) || (r2 + d < r1)) {
					System.out.print("\n2 duong tron eo cat nhau.");
				} else {

					System.out.print("\n2 duong tron cat nhau tai 2 diem.");
				}
			}
		}
	}
}