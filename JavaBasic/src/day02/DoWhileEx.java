package day02;

public class DoWhileEx {
	
	public static void main(String[] args) {
		
		//while문이 do~while 대체 할 수있어서 많이 사용하지 않는다.
		
		// 1~10 합
	/*	int sum = 0;
		int i =1;
		while(i <= 10) {
			
			sum += i;
			\i++;
		}
		
		System.out.println(sum);
		*/
		// do~while문은 조건이 거짓이더라도 무조건 한번은 실행을 합니다.
	int sum= 0;
		int i= 1;	
	do {
		
		sum += i;
		System.out.println(i);
		i++;
	} while(i <= 10);
	System.out.println(sum);
	}
	
}
