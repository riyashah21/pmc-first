package Staticpractise;

public class static_variables {
	
	static int a=m1();
	static {
		System.out.println("inside block");
	}

	static int m1() {
		System.out.println("frm m1");
		return 20;
	}
	//method
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println("from main");
	}
}
