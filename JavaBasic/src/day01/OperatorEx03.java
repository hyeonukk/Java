package day01;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		// if뒤에는 조건이 온다. true라면 if문 실행, false라면 else 실행
		if(x != 10 && ++y == 20 ) { // &가 1개라면 y값이 21 나오지만 &&가 2개면 앞에서 false라 뒤에실행전에 출력됨
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x값:"+x+", y값:"+y);
		
		if( x == 10 || ++y == 21) {// ||가 두개 나오면 앞에 결과만보고 뒤에 실행전에 출력값이 나옴
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x값:"+x+", y값:"+y);
		
		
	}
}
