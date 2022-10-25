package day01;

public class Systemout {

	public static void main(String[] args) {

		//문자와 숫자
		System.out.print("1");
		System.out.print("\n");
		System.out.print(1);
		System.out.print("\n");

		//sysout + ctrl+space는 출력문을 자동생성해줌
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");

		// 형식을 지정하는 출력문 printf
		// 문자형식을 미리지정하고, 필요한 출력값을 지정하는 형태

		/*
		 * 서식문자
		 * %s - 문자열을 입력받음
		 * %d - 정수를 입력받음
		 * %f - 실수를 입력받음 (%.2f - 소수부 자리수를 의미함, 2f는 두자리를 의미함) 
		 * \n - 줄바꿈
		 * \t - 8칸간격 들여쓰기
		 */

		System.out.printf("안녕하세요. 제 이름은 %s입니다~!\n", "홍길동");
		System.out.printf("오늘은 %d월 %d일입니다\n", 9,20);
		System.out.printf("파이의 값은 %.2f입니다\n", 3.14);
		System.out.printf("%d x %d = %d\t%d x %d= %d", 2,1,2,2,2,4);	

		/*
		 * 단축키
		 *  home- 문장 제일 처음, end- 문장제일끝으로 이동 ->shift+ home,end 사용하기
		 *  정렬키 : ctrl+a(전체선택),ctrl+i(정렬)
		 *  행삭제 : ctrl+d 
		 *  행복사 : ctrl+alt+방향키
		 *  코드이동 : alt+방향키
		 *  빠른주석 : ctrl+ /
		 */
		
	}

}
