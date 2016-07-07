package InterfaceTest;

public class C implements A, B{

	@Override
	public void cong(int x, int y) {
		System.out.print("\nTong :"+(x+y));
		
	}

	@Override
	public void nhan(int x, int y) {
		System.out.print("\nTich: "+(x*y));
		
	}

}