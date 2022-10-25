package day01;

public class TypeInteger {

	public static void main(String[] args) {
		//byte, short, int, long
		byte a = 127; // byte는 127까지 저장가능, 
		byte b = -128; // byte 음수는 -128 까지 가능
		
		short c = 32767; 
		short d = -32768;
		
		int e = 2147483647;
		int f = -2147483648;
		
		long g = 151321351115616L;
		long h = -151321351115616L;
	
		System.out.println(h);
	
	/*
	 *  2진수를 저장할때는 0b를 붙임
	 *  8진수를 저장할때는 0을 붙임
	 *  16진수를 저장할때는 0x를 붙임
	 */
		
	int bin = 0b1010; // 2진수
	int octa = 064; // 8진수
	int hexa = 0xAC00; // 16진수

	System.out.println("이진수 1010는" +bin+"입니다"); // 문자열과 붙일때는 + 사용함
	System.out.println("8진수 064는" +octa+"입니다");
	System.out.println("16진수는 0xAC00는"+hexa+"입니다");
	System.out.println("16진수는 0xAC00는"+"입니다");
	
	System.out.println("----------------------------------------------------");
	
	float f1 = 3.14F; // double이 기본형이라서 float을 사용할때는 뒤에 F를 붙임 float는 32칸 double 64칸
	double d1 = 3.14;

	float f2 = 3.1415923333F; // 7자리까지 유효함
	double d2 = 3.1415923333; // 15자리까지 유효함 
	
	System.out.println(f2);
	System.out.println(d2);
	
	System.out.println("----------------------------------");
	
	float f3 = 314.15e-2F;
	double d3 = 0.031415e2;
	
	System.out.println(f3);
	System.out.println(d3);
	
	System.out.println("-------------------------------");
	
	boolean bool1 = true;
	boolean bool2 = false;

	System.out.println(bool1);
	System.out.println(bool2);
	
	
	}
}
