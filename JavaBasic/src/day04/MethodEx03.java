package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		/*
		 *  반환유형(return type)
		 *  1. 반환유형은 메서드가 돌려주는 값에 대한 타입.
		 *  2. 반환유형이 있는 메서드는 호출 구문이 값이 되기 때문에 메서드의 매개값으로 사용될 수 있다.
		 *  ex) println(메서드호출)
		 *  3. 모든 메서드는 return을 만나면 강제종료 된다. 
		 *  4. 리턴문 아래에는 코드를 작성할 수 없다. 
		 */

		//	int result = add(3,5) ;		  
		// System.out.println("결과:" + result);   이거랑 밑에문장이랑 둘다 사용가능.  
		//	System.out.println(add (3, 5));
		int result = add( add(1, 2), add(2, 3) ); // 안쪽구문이 먼저 실행됨.  
		System.out.println(result);
		
		sub(1,2);  // void형 특징 값을 출력해주기만 하면 됨 
		
		noReturn("hello");
		noReturn("bye");
	}

	//반환, 매개변수 둘다 있는 경우
	static int add(int a, int b) {
		int result = a + b;
		return a+b;
		// int r = sub (1,2); 반환유형이 없어서 틀린 구문임. 
		// System.out.println(sub(1,2));  반환유형이 없어서 틀린 구문임. 

	}

	//반환x - 매개변수 o (반환유형이 없으면 그 자리에 void를 적는다,  return이 없고 단순 실행만 한다. ) 
	static void sub(int a, int b) { 
		System.out.println("a-b="+(a-b));

	}

	// void형에서 return - 종료
	static void noReturn(String s) { 

		if(s.equals("hello")) {  //s.equals는 문자열 비교
			System.out.println("실행종료");
			return; // 종료
		}
		System.out.println(s);





	}


}
