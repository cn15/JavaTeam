package Euro2016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TranDau {

	public static void main(String[] args) {
		Bang b1 = new Bang();
		Bang b2 = new Bang();
		Bang b3 = new Bang();
		Bang b4 = new Bang();
		b1.setIdBang(1);
		b2.setIdBang(2);
		b3.setIdBang(3);
		b4.setIdBang(4);
		b1.setTenBang("Bang A");
		b2.setTenBang("Bang B");
		b3.setTenBang("Bang B");
		b4.setTenBang("Bang D");
		int i, j;
		int k = 0, sl = 0;
		ArrayList<QuocGia> qg = new ArrayList<QuocGia>();
		ArrayList<CauThu> ct = new ArrayList<CauThu>();
		try {
			BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap so luong quoc gia tham du: ");
			String sl1 = iK.readLine();
			sl = Integer.parseInt(sl1);
			for (i = 0; i < sl; i++) {
				QuocGia qg1 = new QuocGia();
				if (i == 16) {
					break;
				} else if (i >= 12) {
					System.out.print("\n" + b4.getTenBang());
					qg1.setIdBang(b4.getIdBang());
				} else if (i >= 8) {
					System.out.print("\n" + b3.getTenBang());
					qg1.setIdBang(b3.getIdBang());
				} else if (i >= 4) {
					System.out.print("\n" + b2.getTenBang());
					qg1.setIdBang(b2.getIdBang());
				} else {
					System.out.print("\n" + b1.getTenBang());
					qg1.setIdBang(b1.getIdBang());
				}
				System.out.print("\nNhap ID Quoc gia: ");
				String idqg = iK.readLine();
				qg1.setIdQuocgia(Integer.parseInt(idqg));
				System.out.print("\nNhap Ten quoc gia:");
				qg1.setTenNuoc(iK.readLine());
				qg.add(qg1);
				System.out.print("\nNhap so cau thu mang theo: ");
				String sll2 = iK.readLine();
				int sl2 = Integer.parseInt(sll2);
				k = k + sl2;
				for (j = 0; j < sl2; j++) {
					CauThu ct1 = new CauThu();
					ct1.setTenNuoc(qg1.getTenNuoc());
					System.out.print("\nNhap ID Cau thu: ");
					String idct = iK.readLine();
					ct1.setIdCauthu(Integer.parseInt(idct));
					System.out.print("\nNhap Ten cau thu: ");
					ct1.setTenCauthu(iK.readLine());
					System.out.print("\nNhap Gia tri cau thu: ");
					String gtct = iK.readLine();
					ct1.setGiatriCauthu(Integer.parseInt(gtct));
					ct.add(ct1);
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		int a[];
		a = new int[k];
		for (i = 0; i < k; i++) {
			a[i] = 0;
		}
		for (i = 0; i < k; i++) {
			String xuat = " ";
			if ((ct.get(i).getGiatriCauthu() >= 30) && a[i] == 0) {
				String nuoc = ct.get(i).getTenNuoc();
				for (int i1 = 0; i1 < k; i1++) {
					if (ct.get(i1).getTenNuoc().equals(nuoc)) {
						if (ct.get(i1).getGiatriCauthu() >= 30) {
							a[i1] = 1;
							xuat = xuat + ct.get(i1).getTenCauthu() + " ";
						}
					}
				}
				xuat = xuat + "(" + ct.get(i).getTenNuoc() + ") gap ";
				for (j = 0; j < sl; j++) {
					if (qg.get(j).getTenNuoc().equals(nuoc)) {
						for (int j1 = 0; j1 < sl; j1++) {
							if (qg.get(j1).getTenNuoc().equals(nuoc)) {
								continue;
							} else if (qg.get(j1).getIdBang() == qg.get(j).getIdBang()) {
								String xuat2 = "";
								int t = 0;
								String nuoc2 = qg.get(j1).getTenNuoc();
								for (int i1 = 0; i1 < k; i1++) {
									if (ct.get(i1).getTenNuoc().equals(nuoc2)) {
										if ((ct.get(i1).getGiatriCauthu() >= 30) && a[i1] == 0) {
											t++;
											xuat2 = xuat2 + ct.get(i1).getTenCauthu() + " ";
										}
									}
								}
								if (t > 0) {
									System.out.print(xuat + xuat2 + "(" + nuoc2 + ")" + "\n");
								}
							}
						}
						break;
					}
				}
			}
		}
	}
}
