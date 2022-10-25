package day01;

public class CastingEx03 {
	public static void main(String[] args) {
		
		//연산에서의 형변환 
		char c = 'C'; //67
		int i = 2;
		
		// 1. 서로 다른 타입의 연산에서는 큰타입을 따라간다.
		
		char cc =(char)(c + i); // 소괄호 먼저 처리(c+i)후에 char 변환 
		int ii = c+i;
		
		System.out.println(cc); // E
		System.out.println(ii); // 69
		
		int j = 10;
		double d = 3.14;
		double result = j+d;
		System.out.println(result);
		
		// 2. int형보다 작은 타입의 연산의 결과는 int가 됩니다.
		// 값 출력은 int로해야하기 때문에 byte, short, char 는 캐스팅으로 해야함
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		short s1 = 100;
		byte s2 = 10;
		
		short s3 = (short)(s1 + s2);
		
	}
}
