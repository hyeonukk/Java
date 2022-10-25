package day02;

public class WhileEx03 {
	
	public static void main(String[] args) {
		
		//1~100까지의 정수중 3의배수의 개수 구하기
		int count = 0;
		int i= 1;
		while (i <= 100) {
			
			if(i % 3 == 0){//i는 3의 배수 
				count++;
			}
			i++;
	} 
		System.out.println(count);
}
}

