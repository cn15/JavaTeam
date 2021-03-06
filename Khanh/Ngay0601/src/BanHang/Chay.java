package BanHang;
//Tim mat hang ban duoc nhieu nhat, xuat ra ten Nhan vien va Chi nhanh ban mat hang do.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Chay {

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
		int max = objhang.get(0).getSoLuong(); // Tim mat hang ban duoc nhieu nhat.
		int id = objhang.get(0).getIdNvien(); // Nhan vien ban duoc hang nhieu nhat.
		for (i = 0; i < a; i++) {
			if (objhang.get(i).getSoLuong() > max) {
				max = objhang.get(i).getSoLuong();
				id = objhang.get(i).getIdNvien();
			}
		}
		System.out.print("\nNhan vien ban duoc nhieu hang nhat: ");
		for (i = 0; i < b; i++) {
			if (objnv.get(i).getIdNhanvien() == id) {
				System.out.print(objnv.get(i).getTenNhanvien());
				break;
			}
		}
		int id1 = objnv.get(i).getIdNhanh(); // Xac dinh chi nhanh.
		System.out.print("(Chi nhanh ");
		for (i = 0; i < c; i++) {
			if (objcn.get(i).getIdChinhanh() == id1) {
				System.out.print(objcn.get(i).getTenNhanh() + ")");
			}
		}
	}

}
