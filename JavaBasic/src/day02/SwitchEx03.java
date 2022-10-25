package day02;

public class SwitchEx03 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "@#$"};
		
		//System.out.println(arr[0]);
		/* Math.random()을 사용해서 배열의 인덱스 범위(0~3)까지 랜덤수를 만듭니다.
		 * 랜덤수를 배열의 index를 적용해서 출력된 단어가 한국어, 영어, 일본어, 알수없는 언어
		 * 인지처리를 해보세요
		 */
		int num = (int)(Math.random()*4);
		System.out.println("선택된단어:"+ arr[num]);     
		
		switch(num) { // switch는 정수, 문자만 들어갈 수있음
		case 0:
			System.out.println("안녕");
			break;
		case 1:
			System.out.println("hello");
			break;
		case 2: 
			System.out.println("사요나라");
			break;
		default:
			System.out.println("@#$");
			break;
		
		}
	}
}
