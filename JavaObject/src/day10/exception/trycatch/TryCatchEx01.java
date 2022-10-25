package day10.exception.trycatch;

public class TryCatchEx01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println(a + b);
		try { //try안에 매개변수는 실행이 되지 않는다. 
			System.out.println(a / b);
			System.out.println("이 문장은 실행이 될까요?");
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} // catch뒤에는 해당 예외를 처리할 수 있는 예외종류가 들어간다.
		System.out.println(a - b);
		
	}
}
