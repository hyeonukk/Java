package aip.lang.wrapper;

public class Boxing {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		long c = 200L;
		
		// 기본형을 객체형으로 박스에 담는다(wrapper)
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Long val3 = new Long(c);
		
		Object[] arr = {val1, val2, val3}; //객체형 변수를 Object배열에 저장 (boxing)
		
		//객체형 -> 기본형으로 변경하는 작업 unboxing
		int a1 = val1.intValue();
		double b1 = val2.doubleValue();
		long c1 = val3.longValue();
	}
}
