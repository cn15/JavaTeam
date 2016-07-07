package InterfaceTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chay {

	public static void main(String[] args) {
		BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
		Students a = new Students();
		float diemAnh = 0;
		try {
			System.out.print("\nNhap ten hoc sinh: ");
			a.setName(iK.readLine());
			System.out.print("\nNhap tuoi: ");
			String tuoi1 = iK.readLine();
			a.setAge(Integer.parseInt(tuoi1));
			System.out.print("\nNhap gioi tinh: ");
			a.setSex(iK.readLine());
			for (int j = 0; j < 1; j++) {
				System.out.print("\nNhap ma truong thi vao: ");
				a.truong = iK.readLine();
				if ((a.truong.equals("DUT")) || (a.truong.equals("DTU")) || (a.truong.equals("ITU"))) {
					break;
				} else {
					System.out.print("\nKhong hop le.");
					j = -1;
					continue;
				}
			}
			System.out.print("\nNhap diem thi DH: ");
			String diem1 = iK.readLine();
			a.diem = Float.parseFloat(diem1);
			System.out.print("\nNhap diem tieng Anh: ");
			String diemAnh1 = iK.readLine();
			diemAnh = Float.parseFloat(diemAnh1);
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
						if (a.checkEnglish(diemAnh) == 1) {
							for (int j1 = 0; j1 < 1; j1++) {
								System.out.print("\nBan co muon theo hoc khoa Quoc te khong (Yes/No) ");
								a.chon = iK.readLine();
								if ((a.chon.equals("Yes")) || (a.chon.equals("No"))) {
									a.duration(a.nganh, a.chon);
									break;
								} else {
									System.out.print("\nKhong hop le.");
									j1 = -1;
									continue;
								}
							}
						} else {
							a.chon = "No";
						}
						System.out.print("\nDang ky thanh cong.\n");
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
		} else if (a.i == 1) {
			colStudents b = new colStudents();
			b.setName(a.getName());
			b.setAge(a.getAge());
			b.setSex(a.getSex());
			b.diem = a.diem;
			b.applyToUniversity(b.diem, a.truong);
			if (b.i1 == 0) {
				try {
					for (int j = 0; j < 1; j++) {
						System.out.print("\nBan co muon chuyen he Cao dang? (Yes/No): ");
						String chonHe1 = iK.readLine();
						if (chonHe1.equals("Yes")) {
							b.major(b.diem);
							for (int j1 = 0; j1 < 1; j1++) {
								System.out.print("\nChon nganh muon theo hoc: ");
								b.chonNganh(iK.readLine(), b.diem);
								if (b.i == 0) {
									System.out.print("\nDang ky thanh cong.\n");
									break;
								} else {
									System.out.print("\nKhong hop le.");
									j1 = -1;
									continue;
								}
							}
							b.thongtinSv();
						} else if (chonHe1.equals("No")) {
							System.out.print("\nEnd.");
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
			}
		}
	}

}
