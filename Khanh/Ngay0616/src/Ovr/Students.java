package Ovr;

public class Students extends Human {
	String lop;

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public void Learn() {
		System.out.print("\nTen: " + getName());
		System.out.print("\nTuoi: " + getAge());
		System.out.print("\nGioi tinh: " + getSex());
		System.out.print("\nLop: " + getLop());
	}
}
