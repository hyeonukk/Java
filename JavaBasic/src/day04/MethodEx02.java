package day04;


public class MethodEx02 {

	public static void main(String[] args) {

		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 매서드를 호출할때 필요한 값을 전달하는 매개체.
		 * 2. 매개변수는 몇 개 받을지 메서드를 선언할 때 결정해준다.
		 * 
		 */

	int result = calSum(10);
	System.out.println("1에서 10까지 합 :" + result);

	int result1 = calSum(100);
	System.out.println("1에서 100까지 합 :" + result1);
	
	int result3 = calSum2(10, 20);  //매개변수가 여러개인 경우 그 숫자만큼 입력해줘야함
	System.out.println("10~20까지 합 : "+ result3);
	}
	
	
	
	
	// 반환과 매개변수 둘다 있는 경우
	static	int calSum(int end) { //선언만 해놓는것 타입과 이름만 적어도 됨 
		int sum=0;

		for(int i =1; i<=end; i++) {
			sum +=i;
		}
		
		return sum; 
	}
	// 반환도 있고 매개변수가 여러개인 경우
	
	static int calSum2(int start, int end) {
		int sum =0;
		for (int i = start; i<=end; i++) {
			sum += i ;
		}
		return sum;
	}
	
}
