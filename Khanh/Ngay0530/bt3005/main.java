package bt3005;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) {
		hocsinh a = new hocsinh();
		giaovien b = new giaovien();
		try {
			BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\n---Thong tin hoc sinh---");
			System.out.print("\nNhap vao ho va ten hoc sinh: ");
			a.setHoTen(iK.readLine());
			System.out.print("\nNhap lop hoc cua hoc sinh: ");
			a.setLopHoc(iK.readLine());
			System.out.print("\nNhap diem Toan cua hoc sinh: ");
			String toan1 = iK.readLine();
			a.setDiemToan(Float.parseFloat(toan1));
			System.out.print("\nNhap diem Ly cua hoc sinh: ");
			String ly1 = iK.readLine();
			a.setDiemLy(Float.parseFloat(ly1));
			System.out.print("\nNhap diem Hoa cua hoc sinh: ");
			String hoa1 = iK.readLine();
			a.setDiemHoa(Float.parseFloat(hoa1));
			System.out.print("\n---Thong tin giao vien---");
			System.out.print("\nNhap vao ho va ten giao vien: ");
			b.setHoTen(iK.readLine());
			System.out.print("\nNhap lop day cua giao vien: ");
			b.setLopDay(iK.readLine());
			System.out.print("\nNhap nam sinh cua giao vien: ");
			String sinh1 = iK.readLine();
			b.setNamSinh(Integer.parseInt(sinh1));
			System.out.print("\nNhap luong giao vien: ");
			String luong1 = iK.readLine();
			b.setLuong(Integer.parseInt(luong1));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		float t, l, h;
		t = a.getDiemToan();
		l = a.getDiemLy();
		h = a.getDiemHoa();
		float diemtb = (t + l + h) / 3;
		System.out.print("\nDiem trung binh cua hoc sinh " + a.getHoTen() + ": " + diemtb);
		System.out.print("\nXep loai hoc luc: ");
		{
			if (diemtb >= 8.0f) {
				System.out.print("Gioi.");
			} else if (diemtb >= 6.5f) {
				System.out.print("Kha.");
			} else if (diemtb >= 5.0f) {
				System.out.print("Trung binh.");
			} else if (diemtb >= 4.0f) {
				System.out.print("Thi lai di em.");
			} else {
				System.out.print("O lai lop di em.");
			}
		}
		{
			// So sanh String.
			if (a.getLopHoc().equals(b.getLopDay())) {
				System.out.print("\nGiao vien " + b.getHoTen() + " day hoc sinh " + a.getHoTen());
			} else {
				System.out.print("\nGiao vien " + b.getHoTen() + " khong day hoc sinh " + a.getHoTen());
			}
		}
	}
}
