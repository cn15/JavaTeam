package InterfaceTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chay {

	public static void main(String[] args) {
		BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
		Students a = new Students();
		try {
			System.out.print("\nNhap ten hoc sinh: ");
			a.setName(iK.readLine());
			System.out.print("\nNhap tuoi: ");
			String tuoi1 = iK.readLine();
			a.setAge(Integer.parseInt(tuoi1));
			System.out.print("\nNhap gioi tinh: ");
			a.setSex(iK.readLine());
			for (int j = 0; j < 1; j++) {
				System.out.print("\nNhap truong thi vao: ");
				a.truong = iK.readLine();
				if ((a.truong.equals("DUT")) || (a.truong.equals("DTU")) || (a.truong.equals("ITU"))) {
					break;
				} else {
					System.out.print("\nKhong hop le.");
					j = -1;
					continue;
				}
			}
			System.out.print("\nNhap diem: ");
			String diem1 = iK.readLine();
			a.diem = Float.parseFloat(diem1);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		a.applyToUniversity(a.diem, a.truong);
		if (a.i == 0) {
			a.major(a.diem);
			try {
				for (int j = 0; j < 1; j++) {
					System.out.print("\nChon nganh muon theo hoc: ");
					a.chonNganh(iK.readLine(), a.diem);
					if (a.i == 0) {
						break;
					} else {
						System.out.print("\nKhong hop le.");
						j = -1;
						continue;
					}
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			a.thongtinSv();
		}
	}

}