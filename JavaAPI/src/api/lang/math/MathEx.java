package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		//math클래스는 객체 생성 x Math.을 이용한다. 
		
		double d = Math.ceil(1.3);
		System.out.println(d);
		
		//내림
		double d2 = Math.floor(1.2);
		System.out.println(d2);
		
		//반올림
		double d3 = Math.round(3.14);
		System.out.println(d3);
		//root값 
		double d4 = Math.sqrt(16);
		System.out.println(d4);
		
		//절대값
		double d5 = Math.abs(-4);
		System.out.println(d5);
		
		//대소비교 큰값 출력
		int i1 = Math.max(5, 6);
		System.out.println(i1);
		//대소비교 작은값 출력
		int i2 = Math.min(5, 6);
		System.out.println(i2);
	}
}
