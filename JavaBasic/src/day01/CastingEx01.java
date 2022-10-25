package day01;

public class CastingEx01 {
	public static void main(String[] args) {
		
		byte b = 10;
		
		int s = b; // byte -> int형으로 자동 형변환됨 -> byte가 int보다 작기때문에
		short i = b; // byte -> short형으로 자동 형변환됨 -> byte가 short보다 작기때문에
		long l = b; // byte -> long형으로 자동 형변환됨 -> byte가 long보다 작기때문에
		
		char c = '가';
		int j = c; // char -> int형으로 자동 형변환
		
		System.out.println(s);
		System.out.println(c);
		System.out.println("가의 유니코드 숫자값:" +j); //
		
		int k = 1000;
		double d = k; //int -> double
		System.out.println(d);
	
		
		
	}
}
