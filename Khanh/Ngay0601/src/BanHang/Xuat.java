package BanHang;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Xuat {

	public static void main(String[] args) {
		int a, b, c, i;
		a = 0;
		b = 0;
		c = 0;
		// Tao ArrayList.
		ArrayList<Hang> objhang = new ArrayList<Hang>();
		ArrayList<ChiNhanh> objcn = new ArrayList<ChiNhanh>();
		ArrayList<NhanVien> objnv = new ArrayList<NhanVien>();
		try {
			BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap so luong Hang: ");
			String a1 = iK.readLine();
			a = Integer.parseInt(a1);
			for (i = 0; i < a; i++) {
				Hang a2 = new Hang();
				System.out.print("\nNhap ID cua mat hang thu " + (i + 1) + ": ");
				String id1 = iK.readLine();
				int id = Integer.parseInt(id1);
				a2.setIdHang(id);
				System.out.print("\nNhap ID nhan vien ban hang: ");
				String id2 = iK.readLine();
				int idnv = Integer.parseInt(id2);
				a2.setIdNvien(idnv);
				System.out.print("\nNhap ten hang: ");
				a2.setTenHang(iK.readLine());
				System.out.print("\nNhap so luong ban duoc: ");
				String sl1 = iK.readLine();
				int sl = Integer.parseInt(sl1);
				a2.setSoLuong(sl);
				objhang.add(a2);
			}
			System.out.print("\nDa nhap xong thong tin Hang.");
			System.out.print("\nNhap so luong Chi nhanh: ");
			String b1 = iK.readLine();
			b = Integer.parseInt(b1);
			for (i = 0; i < b; i++) {
				ChiNhanh b2 = new ChiNhanh();
				System.out.print("\nNhap ID Chi nhanh thu " + (i + 1) + ": ");
				String id1 = iK.readLine();
				int id = Integer.parseInt(id1);
				b2.setIdChinhanh(id);
				System.out.print("\nNhap ten nhanh: ");
				b2.setTenNhanh(iK.readLine());
				System.out.print("\nNhap dia chi: ");
				b2.setDiaChi(iK.readLine());
				objcn.add(b2);
			}
			System.out.print("\nDa nhap xong thong tin Chi nhanh.");
			System.out.print("\nNhap so luong nhan vien: ");
			String c1 = iK.readLine();
			c = Integer.parseInt(c1);
			for (i = 0; i < c; i++) {
				NhanVien c2 = new NhanVien();
				System.out.print("\nNhap ID Nhan vien thu " + (i + 1) + ": ");
				String id1 = iK.readLine();
				int id = Integer.parseInt(id1);
				c2.setIdNhanvien(id);
				System.out.print("\nNhap ID Nhanh: ");
				String idd1 = iK.readLine();
				int idd = Integer.parseInt(idd1);
				c2.setIdNhanh(idd);
				System.out.print("\nNhap ten nhan vien: ");
				c2.setTenNhanvien(iK.readLine());
				System.out.print("\nNhap tuoi: ");
				String tuoi1 = iK.readLine();
				int tuoi = Integer.parseInt(tuoi1);
				c2.setTuoi(tuoi);
				System.out.print("\nNhap gioi tinh: ");
				c2.setGioitinh(iK.readLine());
				System.out.print("\nNhap dia chi: ");
				c2.setDiachi(iK.readLine());
				objnv.add(c2);
			}
			System.out.print("\nDa nhap xong thong tin Nhan vien.");
		} catch (Exception e) {
			System.out.print(e.toString());
		}
		System.out.print("\n---Thong tin Hang vua nhap---" + "\n");
		for (i = 0; i < a; i++) {
			System.out.print("\nMat hang " + (i + 1));
			System.out.print("\nID hang: " + objhang.get(i).getIdHang());
			System.out.print("\nID nhan vien: " + objhang.get(i).getIdNvien());
			System.out.print("\nTen hang: " + objhang.get(i).getTenHang());
			System.out.println("\nSo luong ban duoc: " + objhang.get(i).getSoLuong());
		}
		System.out.print("\n---Thong tin Chi nhanh vua nhap---" + "\n");
		for (i = 0; i < b; i++) {
			System.out.print("\nChi nhanh: " + (i + 1));
			System.out.print("\nID nhanh: " + objcn.get(i).getIdChinhanh());
			System.out.print("\nTen nhanh: " + objcn.get(i).getTenNhanh());
			System.out.println("\nDia chi: " + objcn.get(i).getDiaChi());
		}
		System.out.print("\n---Thong tin Nhan vien vua nhap---" + "\n");
		for (i = 0; i < c; i++) {
			System.out.print("\nNhan vien " + (i + 1));
			System.out.print("\nID Nhan vien: " + objnv.get(i).getIdNhanvien());
			System.out.print("\nID nhanh: " + objnv.get(i).getIdNhanh());
			System.out.print("\nTen nhan vien: " + objnv.get(i).getTenNhanvien());
			System.out.print("\nTuoi: " + objnv.get(i).getTuoi());
			System.out.print("\nGioi tinh: " + objnv.get(i).getGioitinh());
			System.out.print("\nDia chi: " + objnv.get(i).getDiachi());
		}
	}
}
