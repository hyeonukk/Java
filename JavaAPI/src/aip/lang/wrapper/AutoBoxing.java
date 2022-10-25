package aip.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		
		//AutoBoxing -> 자동형변환

		int a = 100;
		Integer val1 = a;
		a = val1;
		
		Object[] arr = {1,2,3};
		
	int v1 = Integer.parseInt("3");
	int v2 = Integer.parseInt("34");
	double v3 = Double.parseDouble("3.14");
	Long v4 = Long.parseLong("322323232323");

	System.out.println(v1+v2+v3+v4);
	System.out.println(val1);
	System.out.println(v1+1);
	}
}
