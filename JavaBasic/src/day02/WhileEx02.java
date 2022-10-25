package day02;

public class WhileEx02 {
	
	public static void main(String[] args) {
		
		//  10바퀴 회전하는 반복문에서 짝수만 출력
		
		int i =1;
		while (i<=100) {
			
			if(i % 2 ==0 ) {
			System.out.print(i+" ");
			}
			
			i++;
		}
		System.out.println(); // print 사용할때 줄바꿈
		
		int j = 2;
		while(j<= 100) {
			System.out.print(j+" ");
			j+=2; //2 씩증가
		}
		System.out.println();
	}
}
