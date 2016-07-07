package Test2;
public class Parent extends Human{
	private String tenCon;
	private String gtCon;
	private int tuoiCon;
	private float diemCon;
	private String nganhCon;
	private String truongCon;
	private String tenTruong;
	private int tgHoc;
	private int i;
public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
public int getTgHoc() {
		return tgHoc;
	}
	public void setTgHoc(int tgHoc) {
		this.tgHoc = tgHoc;
	}
public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
public String getTenCon() {
		return tenCon;
	}
	public void setTenCon(String tenCon) {
		this.tenCon = tenCon;
	}
	public String getGtCon() {
		return gtCon;
	}
	public void setGtCon(String gtCon) {
		this.gtCon = gtCon;
	}
	public int getTuoiCon() {
		return tuoiCon;
	}
	public void setTuoiCon(int tuoiCon) {
		this.tuoiCon = tuoiCon;
	}
	public float getDiemCon() {
		return diemCon;
	}
	public void setDiemCon(float diemCon) {
		this.diemCon = diemCon;
	}
	public String getNganhCon() {
		return nganhCon;
	}
	public void setNganhCon(String nganhCon) {
		this.nganhCon = nganhCon;
	}
	public String getTruongCon() {
		return truongCon;
	}
	public void setTruongCon(String truongCon) {
		this.truongCon = truongCon;
	}
public void hasChildis(String tenHocsinh){
	System.out.print("\nThong tin con cai:");
	System.out.print("\nTen: " + tenCon);
	if(i==0){
	System.out.print("\nTuoi: " + tuoiCon);
	System.out.print("\nGioi tinh: " + gtCon);
	System.out.print("\nDang hoc tai truong: "+tenTruong);
	System.out.print("\nDiem thi vao truong: " + diemCon);
	System.out.print("\nNganh theo hoc: " + nganhCon);
	System.out.print("\nThoi gian theo hoc (du kien): "+tgHoc+" nam");
	}
}
}
