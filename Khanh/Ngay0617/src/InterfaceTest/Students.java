package InterfaceTest;

public class Students extends Human implements iUniversity {
	int i = 0;
	float testResult;
	int diemkhoa;
	String truong;
	String nganh;
	float diem;
	String tenTruong;
	int duration;
	String chon;

	public float getTestResult() {
		return testResult;
	}

	public void setTestResult(float testResult) {
		this.testResult = testResult;
	}

	@Override
	// Xuat cac nganh co the chon.
	public void major(float x) {
		System.out.print("\nCac nganh co the chon:");
		System.out.print("\nNetwork. (4 nam)");
		if (x >= diemkhoa + 1) {
			System.out.print("\nSoftware. (3 nam)");
		}
		if (x >= diemkhoa + 2) {
			System.out.print("\nEmbedded. (5 nam)");
		}
	}

	@Override
	public void duration(String faculty, String chonHoc) {
		System.out.print("\nThoi gian hoc: ");
		if (faculty.equals("Network")) {
			duration = 4;
		}
		else if (faculty.equals("Embedded")) {
			duration = 5;
		}
		else if (faculty.equals("Software")) {
			duration = 3;
		}
		if(chonHoc.equals("Yes")){
			duration++;
		}
		System.out.print(duration+" nam.");
	}
	//Kiem tra tieng Anh.
	public int checkEnglish(float testEnglish){
		if(testEnglish>=8.5){
			return 1;
		}
		else return 0;
	}
	// Kiem tra diem thi.
	public void applyToUniversity(float testResult, String university) {
		if (university.equals("DUT")) {
			tenTruong = "Dai hoc Bach Khoa Da Nang";
			if (testResult >= 21) {
				System.out.print("\nBan du dieu kien vao truong BKDN.");
				diemkhoa = 21;
			} else {
				i = 1;
			}
		} else if (university.equals("ITU")) {
			tenTruong = "Dai hoc Cong nghe thong tin";
			if (testResult >= 20) {
				System.out.print("\nBan du dieu kien vao truong DH CNTT.");
				diemkhoa = 20;
			} else {
				i = 1;
			}
		} else if (university.equals("DTU")) {
			tenTruong = "Dai hoc Duy Tan";
			if (testResult >= 16) {
				System.out.print("\nBan du dieu kien vao truong Duy Tan.");
				diemkhoa = 16;
			} else {
				i = 1;
			}
		}
		if (i == 1) {
			System.out.print("\nBan khong du diem vao truong "+tenTruong);
		}
	}

	// Chon nganh hoc.
	public void chonNganh(String chonnganh, float x) {

		if ((chonnganh.equals("Network")) || ((chonnganh.equals("Software")) && (x >= diemkhoa + 1))
				|| ((chonnganh.equals("Embedded")) && (x >= diemkhoa + 2))) {
			nganh = chonnganh;
			i = 0; // Nhap hop le.
		} else {
			i = 1; // Nhap khong hop le.
		}

	}

	// Xuat thong tin sinh vien.
	public void thongtinSv() {
		System.out.print("\nTruong " + tenTruong + " chao don tan sinh vien:");
		System.out.print("\nTen: " + getName());
		System.out.print("\nTuoi: " + getAge());
		System.out.print("\nGioi tinh: " + getSex());
		System.out.print("\nDiem: " + diem);
		System.out.print("\nNganh: " + nganh);
		duration(nganh, chon);
	}
}
