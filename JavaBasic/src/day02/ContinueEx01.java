package day02;

public class ContinueEx01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i%2==1) { //i를 2로 나눴을때 홀수 
			continue; // 다음 반복으로 pass	
			}
			System.out.println(i);
		}
		System.err.println("---------------------------");
		
		int a=1;
		while(a<=10) {
			if(a%2==1) {
				a++;
				// continue;
				// return; // 메인의 종료
		}
		System.out.println(a);
		a++;
		}
		System.out.println("프로그램 정상 종료");
	}
}
