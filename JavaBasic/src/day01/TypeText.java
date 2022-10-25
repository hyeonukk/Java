package day01;

public class TypeText {

	public static void main(String[] args) {
		
		//단일문자를 저장하는 char
		char c1 = 'A';
		char c2 = 66;
		
		System.out.println(c1);
		System.out.println(c2);
		// 아스키코드에 따라 65를 찍으면 A가 나옴 https://stepbystep1.tistory.com/10
		// 유니코드의 등장으로 2byte로 확장되고 부호없는 비트값 65536개의 문자를 표기
	
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c3+"-"+c4+"-"+c5);
		// char는 문자를 표현함
		
		String s1 = "hello";
		String s2 = " world"; // 공백도 문자열 안에선 문자로 기록됨
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		// 문자열은 +로 연결하면 둘이 합친값으로 나옴
		
		// 문자열 길이 확인은 .length()
		System.out.println(s1.length() ); // 5글자

		// 문자열과 다른 타입의 + 연산
		System.out.println(100+200); // 300 숫자+숫자는 결과값 그대로 나옴
		System.out.println("100"+200); // 문자열 + 숫자는 둘다 출력됨 100200(출력)
		System.out.println(100+200+"world"); // 300world 출력
		System.out.println("hello"+100+200); // hello100200 출력
		
		System.out.println("A"+10); //A10
		System.out.println('A'+10); //75
		System.out.println('A'); // 단일문자는 그대로 나옴 
		System.out.println("A"+'A'); // 단일문자는 그대로 나옴 
		//문자, 문자열, 숫자 중에 제일 우선순위가 숫자임
		
		
	}
}
