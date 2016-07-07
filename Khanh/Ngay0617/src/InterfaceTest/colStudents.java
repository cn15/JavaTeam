package InterfaceTest;

public class colStudents extends Students {
	String chonHoc = "";
	int i1 = 0;

	public void major(float x) {
		System.out.print("\nCac nganh co the chon:");
		System.out.print("\nNetwork. (2 nam)");
		if (x >= diemkhoa + 1) {
			System.out.print("\nSoftware. (2 nam)");
		}
		if (x >= diemkhoa + 2) {
			System.out.print("\nEmbedded. (3 nam)");
		}
	}

	public void duration(String faculty, String chonHoc) {
		System.out.print("\nThoi gian hoc: ");
		if (faculty.equals("Network")) {
			duration = 2;
		} else if (faculty.equals("Embedded")) {
			duration = 3;
		} else if (faculty.equals("Software")) {
			duration = 2;
		}
		System.out.print(duration + " nam.");
	}

	public void applyToUniversity(float testResult, String university) {
		if (university.equals("DUT")) {
			tenTruong = "Dai hoc Bach Khoa Da Nang (he Cao dang)";
			if (testResult >= 15) {
				System.out.print("\nBan du dieu kien vao truong BKDN he Cao dang.");
				diemkhoa = 15;
			} else {
				i1 = 1;
			}
		} else if (university.equals("ITU")) {
			tenTruong = "Dai hoc Cong nghe thong tin (he Cao dang)";
			if (testResult >= 14) {
				System.out.print("\nBan du dieu kien vao truong DH CNTT he Cao dang.");
				diemkhoa = 14;
			} else {
				i1 = 1;
			}
		} else if (university.equals("DTU")) {
			tenTruong = "Dai hoc Duy Tan (he Cao dang)";
			if (testResult >= 12) {
				System.out.print("\nBan du dieu kien vao truong Duy Tan he Cao dang.");
				diemkhoa = 12;
			} else {
				i1 = 1;
			}
		}
		if (i1 == 1) {
			System.out.print("\nBan khong du diem vao truong " + tenTruong);
			System.out.print("\nDong ruong menh mong don em ve.");
		}
	}
}
