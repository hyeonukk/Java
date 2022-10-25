package day01;

public class VariableScope {

	public static void main(String[] args) {
	
		int num1 = 10; // int num1=10, num2= 20;
		int num2 = 20;
		int num4 = 0; // 초기값
		// 변수는 해당 중괄호 안에서만 사용할 수 있습니다. 중괄호 안과 밖에서 같은 변수 사용할 수있음 (안,밖은 서로 다른 곳)
		//main 안에서 중괄호 안에 변수를 지역변수라고 부름. 
		if(true) {
			
			int num3 = num1 +num2; // num1+num2 기준으로 num3에 대입
		System.out.println(num3);
		
		num4 = 200; //변경가능
		}
		
		int num3 = 100;
		System.out.println(num3); 
		System.out.println(num4); 
		
	}
}
