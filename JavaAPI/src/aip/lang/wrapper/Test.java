package aip.lang.wrapper;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(0/0);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
