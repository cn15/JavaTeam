package Test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Chay {

	public static void main(String[] args) {
		int t = 0;
		int maso[];
		maso = new int[5];
		for (int ii = 0; ii < 5; ii++) {
			maso[ii] = 0;
		}
		Random rd = new Random();
		BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Students> iSv = new ArrayList<Students>();
		for (int k = 0; k < 5; k++) {
			Students a = new Students();
			float diemAnh = 0;
			try {
				System.out.print("\n\nNhap ten hoc sinh " + (k + 1) + ": ");
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
							for (int iii = 0; iii < 2; iii++) {
								int ms1 = (rd.nextInt(1000) + 1000);
								for (int ii = 0; ii < 5; ii++) {
									if (ms1 == maso[ii]) {
										iii = -1;
										continue;
									}
								}
								a.mssv = ms1;
							}
							iSv.add(a);
							t++;
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
										for (int iii = 0; iii < 2; iii++) {
											int ms1 = (rd.nextInt(1000) + 1000);
											for (int ii = 0; ii < 5; ii++) {
												if (ms1 == maso[ii]) {
													iii = -1;
													continue;
												}
											}
										}
										iSv.add(b);
										t++;
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
		System.out.print("\nDa nhap thong tin " + t + " sinh vien.\n");
		Parent b = new Parent();
		try {
			System.out.print("\nNhap thong tin phu huynh: ");
			System.out.print("\nNhap ten phu huynh: ");
			b.setName(iK.readLine());
			System.out.print("\nNhap tuoi phu huynh: ");
			String tuoiph1 = iK.readLine();
			b.setAge(Integer.parseInt(tuoiph1));
			System.out.print("\nNhap gioi tinh: ");
			b.setSex(iK.readLine());
			System.out.print("\nNhap ten con: ");
			b.setTenCon(iK.readLine());
			System.out.print("\nNhap ma so sinh vien cua con (neu co): ");
			String mssvcon1=iK.readLine();
			int mssvcon = Integer.parseInt(mssvcon1);
			for(int i=0; i<t; i++){
				b.setI(1);
				if((mssvcon == iSv.get(i).mssv)&&(b.getTenCon().equals(iSv.get(i).getName()))){
					b.setI(0);
					b.setDiemCon(iSv.get(i).diem);
					b.setTuoiCon(iSv.get(i).getAge());
					b.setGtCon(iSv.get(i).getSex());
					b.setTenTruong(iSv.get(i).tenTruong);
					b.setNganhCon(iSv.get(i).nganh);
					b.setTgHoc(iSv.get(i).duration);
					break;
				}
			}
			if(b.getI()==1){
				System.out.print("\nKhong tim thay sinh vien.");
			}
			b.hasChildis(b.getTenCon());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
